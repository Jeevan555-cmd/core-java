package com.xworkz.implement;

import com.xworkz.internal.Laptop;
import com.xworkz.internal.Mobile;

public class Devices implements Laptop, Mobile {


    public void runApplication() {
        System.out.println("Laptop application running...");
    }
    public void call() {
        System.out.println("Calling using Mobile...");
    }
}
