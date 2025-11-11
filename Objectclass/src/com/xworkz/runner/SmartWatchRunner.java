package com.xworkz.runner;

import com.xworkz.internal.SmartWatch;

public class SmartWatchRunner {

        public static void main(String[] args) {
            SmartWatch s1 = new SmartWatch("Samsung", "Galaxy Fit3", true, 7999.0, 96);
            SmartWatch s2 = new SmartWatch("Samsung", "Galaxy Fit3", true, 7999.0, 96);
            SmartWatch s3 = new SmartWatch();

            System.out.println(s1);
            System.out.println(s1.equals(s2));
            System.out.println(s1.hashCode());
            System.out.println(s2.hashCode());
        }
    }

