package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.species = "dog";
        dog.name = "Haiku";
        dog.weight = 8.0;
        dog.feed();

        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();

        Phone iPhone = new Phone();
        iPhone.screenSize = 4.5;
        iPhone.operationSystem = "ios";


        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = dog;

        System.out.println("Zwierzak nazwa się: " + me.pet.name);

    }
}
