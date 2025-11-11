package com.xworkz.runner;

import com.xworkz.internal.Printer;

public class PrinterRunner {


        public static void main(String[] args) {
            Printer p1 = new Printer("HP", "Inkjet", true, 8500.0, 15);
            Printer p2 = new Printer("HP", "Inkjet", true, 8500.0, 15);
            Printer p3 = new Printer();

            System.out.println(p1);
            System.out.println(p1.equals(p2));
            System.out.println(p1.hashCode());
            System.out.println(p2.hashCode());
        }
    }
