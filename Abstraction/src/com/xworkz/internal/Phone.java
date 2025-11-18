package com.xworkz.internal;

public abstract class Phone {
    public abstract void call();
     public abstract void message();

    public void charging() {
        System.out.println("Phone is charging");
    }
}

