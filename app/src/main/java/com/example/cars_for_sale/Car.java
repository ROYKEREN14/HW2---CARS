package com.example.cars_for_sale;

import java.io.Serializable;

public class Car implements Serializable {
    private int photo;
    private String brand;
    private String model;
    private String year;
    private String price;

    public Car(int photo, String brand, String model, String year, String price) {
        this.photo = photo;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public int getPhoto() {
        return photo;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getPrice() {
        return price;
    }
}


