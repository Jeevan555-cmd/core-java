package com.xworkz.Internal;

public class Keyboard {

        public String brand;
        public String type;
        public boolean isWireless;
        public double price;
        public int keyCount;

        public Keyboard(String brand, String type, boolean isWireless, double price, int keyCount) {
            this.brand = brand;
            this.type = type;
            this.isWireless = isWireless;
            this.price = price;
            this.keyCount = keyCount;
            System.out.println("It is All args Constructor");
        }

        public Keyboard(String brand, String type) {
            this.brand = brand;
            this.type = type;
            System.out.println("It is 2 args Constructor");
        }

        public Keyboard() {
            System.out.println("It is no args Constructor");
        }

        @Override
        public String toString() {
            return "{Brand:" + brand + ", Type:" + type + ", Wireless:" + isWireless + ", Price:" + price + ", Keys:" + keyCount + "}";
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj instanceof Keyboard) {
                Keyboard k = (Keyboard) obj;
                return this.brand.equals(k.brand) &&
                        this.type.equals(k.type) &&
                        this.isWireless == k.isWireless &&
                        this.price == k.price &&
                        this.keyCount == k.keyCount;
            }
            return false;
        }
    }


