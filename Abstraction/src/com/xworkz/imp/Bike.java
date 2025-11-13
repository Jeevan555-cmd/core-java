package com.xworkz.imp;

import com.xworkz.internal.Vehicle;

public class Bike extends Vehicle {
    @Override
    public void start() {

        System.out.println("Bike starts with kick");
    }
    @Override
    public void stop(){
        System.out.println("It uses brake to stop the vehicle");
    }

}
