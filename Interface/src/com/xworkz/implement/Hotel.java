package com.xworkz.implement;

import com.xworkz.internal.Chef;
import com.xworkz.internal.Waiter;

public class Hotel  implements Waiter, Chef {
    public void cook() {
        System.out.println("Chef is Cooking...");
    }
    public void serve() {
        System.out.println("Waiter is serving...");
    }
}
