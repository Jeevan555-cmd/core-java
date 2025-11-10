package com.xworkz.Runner;

import com.xworkz.Internal.Bag;

public class BagRunner {


        public static void main(String[] args) {
            Bag b1 = new Bag("Skybags", "Blue", 35, 2499.0, true);
            System.out.println(b1.brand);
            System.out.println(b1.color);
            System.out.println(b1.capacity);
            System.out.println(b1);
            Bag b2 = new Bag("Skybags", "Blue", 35, 2499.0, true);
            Bag b3 = new Bag();
            System.out.println(b1.equals(b2));
        }
    }


