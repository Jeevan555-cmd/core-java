package com.xworkz.imp;

import com.xworkz.internal.Printer;

public class HP extends Printer {
    @Override
   public void printDocument() {

        System.out.println("Printing document using HP Printer");
    }

    @Override
    public void type() {
        System.out.println("A4 sheet type printer ");
    }


}
