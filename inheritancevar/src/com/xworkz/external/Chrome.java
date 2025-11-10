package com.xworkz.external;

import com.xworkz.internal.Browser;
public class Chrome extends Browser {
    int version = 129;
    public void open() {
        System.out.println("Chrome v" + version + " is launching...");
    }

    public static void main(String[] args) {
        Browser b = new Browser();
        b.open();

        Chrome c = new Chrome();
        c.open();

        Browser bc = new Chrome();
        bc.open();
    }

}
