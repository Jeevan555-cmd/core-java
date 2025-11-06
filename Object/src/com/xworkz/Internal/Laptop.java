package com.xworkz.Internal;

public class Laptop {

        public String brand;
        public int price;
        public String processor;
        public boolean isAvailable;

        public Laptop(String brand, int price, String processor) {
            this.brand = brand;
            this.price = price;
            this.processor = processor;
            System.out.println("It is All args Constructor");
        }

        public Laptop(boolean isAvailable) {
            this.isAvailable = isAvailable;
            System.out.println("It is 1 arg Constructor");
        }

        public Laptop() {
            System.out.println("It is no args Constructor");
        }

        @Override
        public String toString() {
            return "{Brand: " + brand + ", Price: " + price + ", Processor: " + processor + "}";
        }

}
