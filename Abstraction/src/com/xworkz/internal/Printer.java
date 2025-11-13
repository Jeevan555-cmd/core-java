package com.xworkz.internal;

public  abstract class Printer {
     public abstract void printDocument();

    public void connect() {

        System.out.println("Printer connected successfully");
    }
    public abstract void type();
}
