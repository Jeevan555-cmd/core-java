package com.xworkz.imp;

import com.xworkz.internal.Animal;

public class  Dog extends Animal {

     public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void walk() {
        System.out.println("Dog walks speeder than the cow..");
    }

}

