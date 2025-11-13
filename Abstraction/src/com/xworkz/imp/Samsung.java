package com.xworkz.imp;

import com.xworkz.internal.Phone;

public class Samsung extends Phone {
    @Override
    public void call() {
        System.out.println("Calling from Samsung");
    }

    @Override
     public void message() {
        System.out.println("Message sent from Samsung");
    }
}
