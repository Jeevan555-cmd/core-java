package com.xworkz.implement;

import com.xworkz.internal.Browser;
import com.xworkz.internal.Firefox;

public class Chrome implements Browser, Firefox {
    @Override
    public void createAcc() {
        System.out.println("Please Create an Account.....");

    }

    @Override
    public int subscription() {
        System.out.println("The subscription is:");
        return 199;
    }

    @Override
    public void createAccount() {
        System.out.println("FireFox Account has been created ");

    }

    @Override
    public boolean isSubscroption() {
        System.out.println("Subscription is not purchased yet...");
        return false;
    }
}
