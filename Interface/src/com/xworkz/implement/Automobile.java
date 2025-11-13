package com.xworkz.implement;

import com.xworkz.internal.Bike;
import com.xworkz.internal.Car;

public class Automobile implements Car, Bike {
    public void kickStart() {
        System.out.println("Bike kick-started");
    }
    public void keyStart() {
        System.out.println("Car key-started");
    }
}
