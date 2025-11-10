package com.xworkz.internal;

public class Car {
    public String model;
    public String color;
    public int price;
    public long registrationNo;

    public Car(String model, int price) {
        System.out.println("Car Model: " + model);
        System.out.println("Car Price: " + price);
    }

    public Car(String color, long registrationNo) {
        System.out.println("Car Color: " + color);
        System.out.println("Registration No: " + registrationNo);
    }
}
