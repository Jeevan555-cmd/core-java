package com.xworkz.implement;

import com.xworkz.internal.Dancer;
import com.xworkz.internal.Singer;

public class Performer implements Singer, Dancer {
    public void sing() {
        System.out.println("Singing on stage");
    }
    public void dance() {
        System.out.println("Dancing on stage");
    }
}
