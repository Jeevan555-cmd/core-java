package com.xworkz.Internal;

public class Bike {

        public String brand;
        public int price;
        public String model;
        public boolean isElectric;

        public Bike(String brand, int price, String model) {
            this.brand = brand;
            this.price = price;
            this.model = model;
            System.out.println("It is All args Constructor");
        }

        public Bike(boolean isElectric) {
            this.isElectric = isElectric;
            System.out.println("It is 1 arg Constructor");
        }

        public Bike() {
            System.out.println("It is no args Constructor");
        }

        @Override
        public String toString() {
            return "{Brand: " + brand + ", Price: " + price + ", Model: " + model + "}";
        }

}
