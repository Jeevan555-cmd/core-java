package com.xworkz.Runner;

import com.xworkz.Internal.Pen;

public class PenRunner {

        public static void main(String[] args) {
            Pen p1 = new Pen("Pilot", "Blue", 50, true, "Plastic");
            System.out.println(p1.brand);
            System.out.println(p1.color);
            System.out.println(p1.price);
            System.out.println(p1);
            Pen p2 = new Pen("Pilot", "Blue", 50, true, "Plastic");
            Pen p3 = new Pen();
            System.out.println(p1.equals(p2));
            System.out.println(p1.hashCode());
            System.out.println(p2.hashCode());
        }
    }


