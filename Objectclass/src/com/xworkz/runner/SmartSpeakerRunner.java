package com.xworkz.runner;

import com.xworkz.internal.SmartSpeaker;

public class SmartSpeakerRunner {


        public static void main(String[] args) {
            SmartSpeaker s1 = new SmartSpeaker("Amazon", "Echo Dot", true, 4999.0, "Wi-Fi");
            SmartSpeaker s2 = new SmartSpeaker("Amazon", "Echo Dot", true, 4999.0, "Wi-Fi");
            SmartSpeaker s3 = new SmartSpeaker();

            System.out.println(s1);
            System.out.println(s1.equals(s2));
            System.out.println(s1.hashCode());
            System.out.println(s2.hashCode());
        }
    }

