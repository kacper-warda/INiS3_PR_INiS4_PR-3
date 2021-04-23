package com.company.device;

public class Car extends Device {
    public String color;
    public double engineVolume;

    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public Car(String producer, String model, String color, double volume, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.color = color;
        this.engineVolume = volume;
    }

    @Override
    public void turnOn() {
        System.out.println("odpalam silnik");
    }


}
