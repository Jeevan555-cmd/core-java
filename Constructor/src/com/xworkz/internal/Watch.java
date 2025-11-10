package com.xworkz.internal;

public class Watch {
    public String brand;
    public double price;
    public char size;
    public boolean isDigital;

    public Watch(String brand, double price) {
        System.out.println("Watch Brand: " + brand);
        System.out.println("Watch Price: ₹" + price);
    }

    public Watch(char size, boolean isDigital) {
        System.out.println("Watch Size: " + size);
        System.out.println("Is Digital: " + isDigital);
    }
}
