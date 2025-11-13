package com.xworkz.external;

import com.xworkz.implement.Automobile;
import com.xworkz.internal.Bike;
import com.xworkz.internal.Car;

public class AutomobileRunner {
    public static void main(String[] args) {

        Bike bike = new Automobile();
        bike.kickStart();

        Car car = new Automobile();
        car.keyStart();
    }
}
