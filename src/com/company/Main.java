package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog", 20.0, "Szarik");
        dog.feed();

        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();



        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = dog;

        System.out.println("Zwierzak nazwa się: " + me.pet.name);

    }
}
