package com.xworkz.Runner;

import com.xworkz.Internal.Keyboard;

public class KeyboardRunner {

        public static void main(String[] args) {
            Keyboard k1 = new Keyboard("Logitech", "Mechanical", true, 4999.0, 104);
            System.out.println(k1.brand);
            System.out.println(k1.type);
            System.out.println(k1.isWireless);
            System.out.println(k1);
            Keyboard k2 = new Keyboard("Logitech", "Mechanical", true, 4999.0, 104);
            Keyboard k3 = new Keyboard();
            System.out.println(k1.equals(k2));
        }
    }


