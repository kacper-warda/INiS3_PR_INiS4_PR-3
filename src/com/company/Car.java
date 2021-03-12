package com.company;

public class Car {
    final public String producer;
    final public String model;
    public String color;
    public double engineVolume;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public Car(String producer, String model, String color, double volume) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.engineVolume = volume;
    }

}
