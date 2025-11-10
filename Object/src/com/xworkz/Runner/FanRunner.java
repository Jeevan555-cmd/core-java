package com.xworkz.Runner;

import com.xworkz.Internal.Fan;

public class FanRunner {

        public static void main(String[] args) {
            Fan f1 = new Fan("Usha", 1200, 2999.0, "White", true);
            System.out.println(f1.brand);
            System.out.println(f1.speed);
            System.out.println(f1.price);
            System.out.println(f1);
            Fan f2 = new Fan("Usha", 1200, 2999.0, "White", true);
            Fan f3 = new Fan();
            System.out.println(f1.equals(f2));
        }
    }


