package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Phone iPhone = new Phone("Apple", "S6", 4.0, "iOS");

        Human kacper = new Human();

        kacper.pet = new Animal("dog");
        kacper.car = new Car("Fiat", "Multipla");

        //formatowanie liczb
        double value = 200.3456;
        System.out.printf("Value: %.2f", value);

        System.out.println("Value: " + String.format("%.2f", value));

        DecimalFormat formatter = new DecimalFormat("####0.00");
        System.out.println("Value: " + formatter.format(value));

    }
}
