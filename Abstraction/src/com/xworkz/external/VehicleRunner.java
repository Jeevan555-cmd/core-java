package com.xworkz.external;

import com.xworkz.imp.Bike;
import com.xworkz.internal.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
        v.stop();
        Vehicle.exhaust();
    }
}
