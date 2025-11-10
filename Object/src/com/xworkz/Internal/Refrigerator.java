package com.xworkz.Internal;

public class Refrigerator {

        public String brand;
        public int capacity;
        public double price;
        public String color;
        public boolean isDoubleDoor;

        public Refrigerator(String brand, int capacity, double price, String color, boolean isDoubleDoor) {
            this.brand = brand;
            this.capacity = capacity;
            this.price = price;
            this.color = color;
            this.isDoubleDoor = isDoubleDoor;
            System.out.println("It is All args Constructor");
        }

        public Refrigerator(String brand, int capacity) {
            this.brand = brand;
            this.capacity = capacity;
            System.out.println("It is 2 args Constructor");
        }

        public Refrigerator() {
            System.out.println("It is no args Constructor");
        }

        @Override
        public String toString() {
            return "{Brand:" + brand + ", Capacity:" + capacity + "L, Price:" + price + ", Color:" + color + ", DoubleDoor:" + isDoubleDoor + "}";
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj instanceof Refrigerator) {
                Refrigerator r = (Refrigerator) obj;
                return this.brand.equals(r.brand) &&
                        this.capacity == r.capacity &&
                        this.price == r.price &&
                        this.color.equals(r.color) &&
                        this.isDoubleDoor == r.isDoubleDoor;
            }
            return false;
        }
    }


