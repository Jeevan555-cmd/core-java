package com.xworkz.Runner;

import com.xworkz.Internal.Shoes;

public class ShoesRunner {

        public static void main(String[] args) {
            Shoes s1 = new Shoes("Nike", 9, "White", 7499.0, true);
            System.out.println(s1.brand);
            System.out.println(s1.size);
            System.out.println(s1.color);
            System.out.println(s1);
            Shoes s2 = new Shoes("Nike", 9, "White", 7499.0, true);
            Shoes s3 = new Shoes();
            System.out.println(s1.equals(s2));
        }
    }


