package com.xworkz.Internal;

public class Shoes {

        public String brand;
        public int size;
        public String color;
        public double price;
        public boolean isRunningType;

        public Shoes(String brand, int size, String color, double price, boolean isRunningType) {
            this.brand = brand;
            this.size = size;
            this.color = color;
            this.price = price;
            this.isRunningType = isRunningType;
            System.out.println("It is All args Constructor");
        }

        public Shoes(String brand, int size) {
            this.brand = brand;
            this.size = size;
            System.out.println("It is 2 args Constructor");
        }

        public Shoes() {
            System.out.println("It is no args Constructor");
        }

        @Override
        public String toString() {
            return "{Brand:" + brand + ", Size:" + size + ", Color:" + color + ", Price:" + price + ", RunningType:" + isRunningType + "}";
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj instanceof Shoes) {
                Shoes s = (Shoes) obj;
                return this.brand.equals(s.brand) &&
                        this.size == s.size &&
                        this.color.equals(s.color) &&
                        this.price == s.price &&
                        this.isRunningType == s.isRunningType;
            }
            return false;
        }
    }


