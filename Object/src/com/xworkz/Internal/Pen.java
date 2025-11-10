package com.xworkz.Internal;

public class Pen {

        public String brand;
        public String color;
        public double price;
        public boolean isGel;
        public String material;

        public Pen(String brand, String color, double price, boolean isGel, String material) {
            this.brand = brand;
            this.color = color;
            this.price = price;
            this.isGel = isGel;
            this.material = material;
            System.out.println("It is All args Constructor");
        }

        public Pen(String brand, String color) {
            this.brand = brand;
            this.color = color;
            System.out.println("It is 2 args Constructor");
        }

        public Pen() {
            System.out.println("It is no args Constructor");
        }

        @Override
        public String toString() {
            return "{Brand:" + brand + ", Color:" + color + ", Price:" + price + ", Gel:" + isGel + ", Material:" + material + "}";
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj instanceof Pen) {
                Pen p = (Pen) obj;
                return this.brand.equals(p.brand) &&
                        this.color.equals(p.color) &&
                        this.price == p.price &&
                        this.isGel == p.isGel &&
                        this.material.equals(p.material);
            }
            return false;
        }


}
