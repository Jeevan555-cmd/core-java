package com.xworkz.internal;

public class Printer {

        public String brand;
        public String type;
        public boolean isWireless;
        public double price;
        public int speed;

        public Printer(String brand, String type, boolean isWireless, double price, int speed) {
            this.brand = brand;
            this.type = type;
            this.isWireless = isWireless;
            this.price = price;
            this.speed = speed;
            System.out.println("It is All args Constructor");
        }

        public Printer(String brand, String type) {
            this.brand = brand;
            this.type = type;
            System.out.println("It is 2 args Constructor");
        }

        public Printer() {
            System.out.println("It is no args Constructor");
        }

        @Override
        public String toString() {
            return "{Brand:" + brand + ", Type:" + type + ", Wireless:" + isWireless + ", Price:" + price + ", Speed:" + speed + "}";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj instanceof Printer) {
                Printer p = (Printer) obj;
                return this.brand.equals(p.brand) &&
                        this.type.equals(p.type) &&
                        this.isWireless == p.isWireless &&
                        this.price == p.price &&
                        this.speed == p.speed;
            }
            return false;
        }

        @Override
        public int hashCode() {
            int prime = 7;
            int result = 1;
            result = prime * result + speed;
            return result;
        }
    }
