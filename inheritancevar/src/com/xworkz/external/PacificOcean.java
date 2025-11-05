package com.xworkz.external;

import com.xworkz.internal.Ocean;

public class PacificOcean extends Ocean {
    double area = 165_000_000;
    public void info() {
        System.out.println("Pacific Ocean area: " + area + " sq km");
    }

    public static void main(String[] args) {
        Ocean o = new Ocean();
        o.info();

        PacificOcean p = new PacificOcean();
        p.info();

        Ocean op = new PacificOcean();
        op.info();
    }
}
