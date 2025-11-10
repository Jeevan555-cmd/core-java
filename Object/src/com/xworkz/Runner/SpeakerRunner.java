package com.xworkz.Runner;

import com.xworkz.Internal.Speaker;

public class SpeakerRunner {

        public static void main(String[] args) {
            Speaker s1 = new Speaker("JBL", 40, 4999.0, true, "Black");
            System.out.println(s1.brand);
            System.out.println(s1.watt);
            System.out.println(s1.price);
            System.out.println(s1);
            Speaker s2 = new Speaker("JBL", 40, 4999.0, true, "Black");
            Speaker s3 = new Speaker();
            System.out.println(s1.equals(s2));
        }
    }


