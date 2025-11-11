package com.xworkz.internal;

public class Projector {

        public String brand;
        public String resolution;
        public int lumens;
        public double price;
        public boolean isPortable;

        public Projector(String brand, String resolution, int lumens, double price, boolean isPortable) {
            this.brand = brand;
            this.resolution = resolution;
            this.lumens = lumens;
            this.price = price;
            this.isPortable = isPortable;
            System.out.println("It is All args Constructor");
        }

        public Projector(String brand, String resolution) {
            this.brand = brand;
            this.resolution = resolution;
            System.out.println("It is 2 args Constructor");
        }

        public Projector() {
            System.out.println("It is no args Constructor");
        }

        @Override
        public String toString() {
            return "{Brand:" + brand + ", Resolution:" + resolution + ", Lumens:" + lumens + ", Price:" + price + ", Portable:" + isPortable + "}";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj instanceof Projector) {
                Projector p = (Projector) obj;
                return this.brand.equals(p.brand) &&
                        this.resolution.equals(p.resolution) &&
                        this.lumens == p.lumens &&
                        this.price == p.price &&
                        this.isPortable == p.isPortable;
            }
            return false;
        }

        @Override
        public int hashCode() {
            int prime = 7;
            int result = 1;
            result = prime * result + lumens;
            return result;
        }
    }


