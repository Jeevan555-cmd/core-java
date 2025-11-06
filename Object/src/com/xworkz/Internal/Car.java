package com.xworkz.Internal;

public class Car {

        public String brand;
        public int price;
        public String color;
        public boolean isAutomatic;

        public Car(String brand, int price, String color) {
            this.brand = brand;
            this.price = price;
            this.color = color;
            System.out.println("It is All args Constructor");
        }

        public Car(boolean isAutomatic) {
            this.isAutomatic = isAutomatic;
            System.out.println("It is 1 arg Constructor");
        }

        public Car() {
            System.out.println("It is no args Constructor");
        }

        @Override
        public String toString() {
            return "{Brand: " + brand + ", Price: " + price + ", Color: " + color + "}";
        }

}
