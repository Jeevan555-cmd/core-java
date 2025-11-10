package com.xworkz.Internal;

public class Mobile {

        public String brand;
        public int price;
        public String storage;
        public boolean is5G;

        public Mobile(String brand, int price, String storage) {
            this.brand = brand;
            this.price = price;
            this.storage = storage;
            System.out.println("It is All args Constructor");
        }

        public Mobile(boolean is5G) {
            this.is5G = is5G;
            System.out.println("It is 1 arg Constructor");
        }

        public Mobile() {
            System.out.println("It is no args Constructor");
        }

        @Override
        public String toString() {
            return "{Brand: " + brand + ", Price: " + price + ", Storage: " + storage + "}";
        }

}
