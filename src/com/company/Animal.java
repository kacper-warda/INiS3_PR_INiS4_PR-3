package com.company;

import java.io.File;

public class Animal {
    final public String species;
    public String name;
    public File pic;
    private Double weight;

    static final public double DEFAULT_ANIMAL_WEIGHT = 1.0;
    static final public double DEFAULT_DOG_WEIGHT = 3.0;
    static final public double DEFAULT_CAT_WEIGHT = 2.0;
    static final public double DEFAULT_COW_WEIGHT = 300.0;
    private static final double DEFAULT_FOOD_WEIGHT = 0.2;

    public Animal(String species) {
        this.species = species;

        switch (this.species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "cat":
                this.weight = DEFAULT_CAT_WEIGHT;
                break;
            case "cow":
                this.weight = DEFAULT_COW_WEIGHT;
                break;
            default:
                this.weight = DEFAULT_ANIMAL_WEIGHT;
                break;
        }
    }


    void feed() {
        if (this.weight <= 0) {
            System.out.println("SORRY, TO LATE");
        } else {
            this.weight += DEFAULT_FOOD_WEIGHT;
            System.out.println("Thx for food, bro. My weight is now " + this.weight);
        }
    }

    void takeForAWalk() {
        if (this.weight <= 0) {
            System.out.println("YOU CANNOT WALK THE TOWN WITH DEAD ANIMAL!");
        } else {
            this.weight -= DEFAULT_FOOD_WEIGHT;
            System.out.println("Nice walk :D. My weight is now " + this.weight);
        }
    }
}
