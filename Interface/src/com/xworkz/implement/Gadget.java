package com.xworkz.implement;

import com.xworkz.internal.Camera;
import com.xworkz.internal.Drone;

public class Gadget implements Drone, Camera {

    public void capture() {
        System.out.println("Capturing a photo...");
    }
    public void fly() {
        System.out.println("Drone is flying...");
    }
}
