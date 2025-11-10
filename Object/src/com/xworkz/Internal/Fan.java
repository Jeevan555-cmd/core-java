package com.xworkz.Internal;

public class Fan {

        public String brand;
        public int speed;
        public double price;
        public String color;
        public boolean isCeilingType;

        public Fan(String brand, int speed, double price, String color, boolean isCeilingType) {
            this.brand = brand;
            this.speed = speed;
            this.price = price;
            this.color = color;
            this.isCeilingType = isCeilingType;
            System.out.println("It is All args Constructor");
        }

        public Fan(String brand, String color) {
            this.brand = brand;
            this.color = color;
            System.out.println("It is 2 args Constructor");
        }

        public Fan() {
            System.out.println("It is no args Constructor");
        }

        @Override
        public String toString() {
            return "{Brand:" + brand + ", Speed:" + speed + ", Price:" + price + ", Color:" + color + ", Ceiling:" + isCeilingType + "}";
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj instanceof Fan) {
                Fan f = (Fan) obj;
                return this.brand.equals(f.brand) &&
                        this.speed == f.speed &&
                        this.price == f.price &&
                        this.color.equals(f.color) &&
                        this.isCeilingType == f.isCeilingType;
            }
            return false;
        }


}
