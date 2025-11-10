package com.xworkz.Internal;

public class Headphone {

        public String brand;
        public boolean isWireless;
        public int batteryLife;
        public double price;
        public String color;

        public Headphone(String brand, boolean isWireless, int batteryLife, double price, String color) {
            this.brand = brand;
            this.isWireless = isWireless;
            this.batteryLife = batteryLife;
            this.price = price;
            this.color = color;
            System.out.println("It is All args Constructor");
        }

        public Headphone(String brand, boolean isWireless) {
            this.brand = brand;
            this.isWireless = isWireless;
            System.out.println("It is 2 args Constructor");
        }

        public Headphone() {
            System.out.println("It is no args Constructor");
        }

        @Override
        public String toString() {
            return "{Brand:" + brand + ", Wireless:" + isWireless + ", Battery:" + batteryLife + ", Price:" + price + ", Color:" + color + "}";
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj instanceof Headphone) {
                Headphone h = (Headphone) obj;
                return this.brand.equals(h.brand) &&
                        this.isWireless == h.isWireless &&
                        this.batteryLife == h.batteryLife &&
                        this.price == h.price &&
                        this.color.equals(h.color);
            }
            return false;
        }


}
