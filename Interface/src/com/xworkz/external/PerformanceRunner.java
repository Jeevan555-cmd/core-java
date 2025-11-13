package com.xworkz.external;

import com.xworkz.implement.Performer;
import com.xworkz.internal.Dancer;
import com.xworkz.internal.Singer;

public class PerformanceRunner {
    public static void main(String[] args) {

        Singer singer = new Performer();
        singer.sing();

        Dancer dancer = new Performer();
        dancer.dance();
    }
}
