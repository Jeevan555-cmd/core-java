package com.xworkz.external;

import com.xworkz.implement.Chrome;
import com.xworkz.internal.Browser;
import com.xworkz.internal.Firefox;

public class User {
    public static void main(String[] args){
        Browser browser=new Chrome();
        browser.createAcc();
        System.out.println(browser.subscription());

        Firefox firefox=new Chrome();
        firefox.createAccount();
        System.out.println(firefox.isSubscroption());
    }
}
