package com.xworkz.external;

import com.xworkz.implement.Entertainment;
import com.xworkz.internal.Radio;
import com.xworkz.internal.TV;

public class EntertainmentRunner {
    public static void main(String[] args) {

        TV tv = new Entertainment();
        tv.playChannel();
        System.out.println("TV Volume: " + tv.volume());

        Radio radio = new Entertainment();
        radio.tuneFrequency();
        System.out.println("Is FM? : " + radio.isFM());
    }
}
