package com.xworkz.internal;

public class Camera {
    public String brand;
    public double megapixels;
    public int price;
    public boolean hasZoom;

    public Camera(String brand, double megapixels) {
        System.out.println("Camera Brand: " + brand);
        System.out.println("Megapixels: " + megapixels);
    }

    public Camera(int price, boolean hasZoom) {
        System.out.println("Camera Price: " + price);
        System.out.println("Has Optical Zoom: " + hasZoom);
    }

}
