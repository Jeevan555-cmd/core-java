package com.xworkz.Internal;

public class Camera {

        public String brand;
        public double megapixels;
        public int zoom;
        public double price;
        public boolean isDSLR;

        public Camera(String brand, double megapixels, int zoom, double price, boolean isDSLR) {
            this.brand = brand;
            this.megapixels = megapixels;
            this.zoom = zoom;
            this.price = price;
            this.isDSLR = isDSLR;
            System.out.println("It is All args Constructor");
        }

        public Camera(String brand, double megapixels) {
            this.brand = brand;
            this.megapixels = megapixels;
            System.out.println("It is 2 args Constructor");
        }

        public Camera() {
            System.out.println("It is no args Constructor");
        }

        @Override
        public String toString() {
            return "{Brand:" + brand + ", MP:" + megapixels + ", Zoom:" + zoom + ", Price:" + price + ", DSLR:" + isDSLR + "}";
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj instanceof Camera) {
                Camera c = (Camera) obj;
                return this.brand.equals(c.brand) &&
                        this.megapixels == c.megapixels &&
                        this.zoom == c.zoom &&
                        this.price == c.price &&
                        this.isDSLR == c.isDSLR;
            }
            return false;
        }
    }


