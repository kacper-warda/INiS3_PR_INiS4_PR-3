package com.company;

import com.company.device.Phone;

public class Main {

    public static void main(String[] args) {


        Phone iphone = new Phone("apple", "6s", 4.5, "iOS", 2016);
        iphone.turnOn();
        System.out.println(iphone.model);
        System.out.println(iphone.producer);


    }
}
