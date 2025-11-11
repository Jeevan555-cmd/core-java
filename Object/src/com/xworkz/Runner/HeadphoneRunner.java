package com.xworkz.Runner;

import com.xworkz.Internal.Headphone;

public class HeadphoneRunner {

        public static void main(String[] args) {
            Headphone h1 = new Headphone("Sony", true, 30, 12999.0, "Black");
            System.out.println(h1.brand);
            System.out.println(h1.isWireless);
            System.out.println(h1.batteryLife);
            System.out.println(h1);
            Headphone h2 = new Headphone("Sony", true, 30, 12999.0, "Black");
            Headphone h3 = new Headphone();
            System.out.println(h1.equals(h2));
            System.out.println(h1.hashCode());
            System.out.println(h2.hashCode());
        }
    }


