package com.xworkz.internal;

public class Laptop {
    public int price;
    public String brand;
    public String processor;
    public boolean isTouchScreen;

    public Laptop(int price, String brand) {
        System.out.println("Laptop Price: " + price);
        System.out.println("Laptop Brand: " + brand);
    }

    public Laptop(String processor, boolean isTouchScreen) {
        System.out.println("Processor Type: " + processor);
        System.out.println("Touchscreen Available: " + isTouchScreen);
    }
}
