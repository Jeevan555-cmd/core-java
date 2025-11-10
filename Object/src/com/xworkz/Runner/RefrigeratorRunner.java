package com.xworkz.Runner;

import com.xworkz.Internal.Refrigerator;

public class RefrigeratorRunner {

        public static void main(String[] args) {
            Refrigerator r1 = new Refrigerator("LG", 250, 24999.0, "Silver", true);
            System.out.println(r1.brand);
            System.out.println(r1.capacity);
            System.out.println(r1.price);
            System.out.println(r1);
            Refrigerator r2 = new Refrigerator("LG", 250, 24999.0, "Silver", true);
            Refrigerator r3 = new Refrigerator();
            System.out.println(r1.equals(r2));
        }
    }


