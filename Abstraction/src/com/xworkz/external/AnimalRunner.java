package com.xworkz.external;

import com.xworkz.imp.Dog;
import com.xworkz.internal.Animal;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.sleep();
        a.walk();
    }
}
