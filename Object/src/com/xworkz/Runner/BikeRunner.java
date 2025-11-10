package com.xworkz.Runner;

import com.xworkz.Internal.Bike;

public class BikeRunner {

        public static void main(String[] args) {
            Bike bike = new Bike("Yamaha", 120000, "MT-15");
            System.out.println(bike);

            Bike bike1 = new Bike(false);
            System.out.println("Is Electric: " + bike1.isElectric);

            Bike bike2 = new Bike();
        }

}
