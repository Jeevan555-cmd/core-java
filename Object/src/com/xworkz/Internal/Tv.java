package com.xworkz.Internal;

public class Tv {

        public String brand;
        public int size;
        public boolean isSmart;
        public double price;
        public String resolution;

        public Tv(String brand, int size, boolean isSmart, double price, String resolution) {
            this.brand = brand;
            this.size = size;
            this.isSmart = isSmart;
            this.price = price;
            this.resolution = resolution;
            System.out.println("It is All args Constructor");
        }

        public Tv(String brand, int size) {
            this.brand = brand;
            this.size = size;
            System.out.println("It is 2 args Constructor");
        }

        public Tv() {
            System.out.println("It is no args Constructor");
        }

        @Override
        public String toString() {
            return "{Brand:" + brand + ", Size:" + size + ", Smart:" + isSmart + ", Price:" + price + ", Resolution:" + resolution + "}";
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj instanceof Tv) {
                Tv t = (Tv) obj;
                return this.brand.equals(t.brand) &&
                        this.size == t.size &&
                        this.isSmart == t.isSmart &&
                        this.price == t.price &&
                        this.resolution.equals(t.resolution);
            }
            return false;
        }


}
