package com.xworkz.internal;

public class SmartWatch {

        public String brand;
        public String model;
        public boolean hasGPS;
        public double price;
        public int batteryLife;

        public SmartWatch(String brand, String model, boolean hasGPS, double price, int batteryLife) {
            this.brand = brand;
            this.model = model;
            this.hasGPS = hasGPS;
            this.price = price;
            this.batteryLife = batteryLife;
            System.out.println("It is All args Constructor");
        }

        public SmartWatch(String brand, double price) {
            this.brand = brand;
            this.price = price;
            System.out.println("It is 2 args Constructor");
        }

        public SmartWatch() {
            System.out.println("It is no args Constructor");
        }

        @Override
        public String toString() {
            return "{Brand:" + brand + ", Model:" + model + ", GPS:" + hasGPS + ", Price:" + price + ", BatteryLife:" + batteryLife + " hrs}";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj instanceof SmartWatch) {
                SmartWatch s = (SmartWatch) obj;
                return this.brand.equals(s.brand) &&
                        this.model.equals(s.model) &&
                        this.hasGPS == s.hasGPS &&
                        this.price == s.price &&
                        this.batteryLife == s.batteryLife;
            }
            return false;
        }

        @Override
        public int hashCode() {
            int prime = 7;
            int result = 1;
            result = prime * result + batteryLife;
            return result;
        }
    }

