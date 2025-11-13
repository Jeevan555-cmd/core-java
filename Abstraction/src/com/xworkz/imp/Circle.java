package com.xworkz.imp;

import com.xworkz.internal.Shape;

public class Circle extends Shape {
    double radius = 5;

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}
