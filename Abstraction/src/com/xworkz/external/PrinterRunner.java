package com.xworkz.external;

import com.xworkz.imp.HP;
import com.xworkz.internal.Printer;

public class PrinterRunner {
    public static void main(String[] args) {
        Printer p = new HP();
        p.connect();
        p.type();
        p.printDocument();
    }

}
