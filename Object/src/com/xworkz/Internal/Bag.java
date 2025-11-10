package com.xworkz.Internal;

public class Bag {

        public String brand;
        public String color;
        public int capacity;
        public double price;
        public boolean isWaterproof;

        public Bag(String brand, String color, int capacity, double price, boolean isWaterproof) {
            this.brand = brand;
            this.color = color;
            this.capacity = capacity;
            this.price = price;
            this.isWaterproof = isWaterproof;
            System.out.println("It is All args Constructor");
        }

        public Bag(String brand, String color) {
            this.brand = brand;
            this.color = color;
            System.out.println("It is 2 args Constructor");
        }

        public Bag() {
            System.out.println("It is no args Constructor");
        }

        @Override
        public String toString() {
            return "{Brand:" + brand + ", Color:" + color + ", Capacity:" + capacity + "L, Price:" + price + ", Waterproof:" + isWaterproof + "}";
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj instanceof Bag) {
                Bag b = (Bag) obj;
                return this.brand.equals(b.brand) &&
                        this.color.equals(b.color) &&
                        this.capacity == b.capacity &&
                        this.price == b.price &&
                        this.isWaterproof == b.isWaterproof;
            }
            return false;
        }
    }


