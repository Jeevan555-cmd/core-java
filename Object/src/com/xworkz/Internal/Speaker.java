package com.xworkz.Internal;

public class Speaker {

        public String brand;
        public int watt;
        public double price;
        public boolean isBluetooth;
        public String color;

        public Speaker(String brand, int watt, double price, boolean isBluetooth, String color) {
            this.brand = brand;
            this.watt = watt;
            this.price = price;
            this.isBluetooth = isBluetooth;
            this.color = color;
            System.out.println("It is All args Constructor");
        }

        public Speaker(String brand, boolean isBluetooth) {
            this.brand = brand;
            this.isBluetooth = isBluetooth;
            System.out.println("It is 2 args Constructor");
        }

        public Speaker() {
            System.out.println("It is no args Constructor");
        }

        @Override
        public String toString() {
            return "{Brand:" + brand + ", Watt:" + watt + ", Price:" + price + ", Bluetooth:" + isBluetooth + ", Color:" + color + "}";
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj instanceof Speaker) {
                Speaker s = (Speaker) obj;
                return this.brand.equals(s.brand) &&
                        this.watt == s.watt &&
                        this.price == s.price &&
                        this.isBluetooth == s.isBluetooth &&
                        this.color.equals(s.color);
            }
            return false;
        }
    }


