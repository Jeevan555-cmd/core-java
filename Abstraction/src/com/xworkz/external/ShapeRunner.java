package com.xworkz.external;

import com.xworkz.imp.Circle;
import com.xworkz.internal.Shape;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.display();
        System.out.println("Area: " + s.area());
    }
}
