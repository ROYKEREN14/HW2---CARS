package com.example.cars_for_sale;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    public static Context Context;

    public static void StoreData(List<Car> cars)
    {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Context);
        SharedPreferences.Editor editor = sp.edit();
        String json = new Gson().toJson(cars);
        editor.putString("cars", json);
        editor.commit();
    }

    public static List<Car> LoadData()
    {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Context);
        String json = sp.getString("cars",null);
        if (json != null)
        {
            Type type = new TypeToken<List<Car>>(){}.getType();
            return new Gson().fromJson(json,type);
        }
        else
        {
            List<Car> cars = new ArrayList<>();
            cars.add(new Car(R.drawable.car1,"BMW","G3","2010","200000"));
            cars.add(new Car(R.drawable.car2,"Toyota","G4","2011","250000"));
            cars.add(new Car(R.drawable.car3,"Tesla","G5","2012","300000"));
            cars.add(new Car(R.drawable.car4,"Mazra","G6","2014","400000"));
            cars.add(new Car(R.drawable.car5,"Hundar","G7","2015","450000"));
            cars.add(new Car(R.drawable.car6,"Rizoty","G8","2016","500000"));
            cars.add(new Car(R.drawable.car7,"Folswagen","G9","2017","600000"));
            cars.add(new Car(R.drawable.car8,"Nissan","G10","2018","700000"));
            return cars;
        }
    }

}
