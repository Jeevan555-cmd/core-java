package com.xworkz.external;

import com.xworkz.imp.Samsung;
import com.xworkz.internal.Phone;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone p = new Samsung();
        p.call();
        p.message();
        p.charging();
    }
}
