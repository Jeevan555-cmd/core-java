package com.xworkz.runner;

import com.xworkz.internal.Projector;

public class ProjectorRunner {



        public static void main(String[] args) {
            Projector p1 = new Projector("Epson", "1080p", 3000, 45000.0, true);
            Projector p2 = new Projector("Epson", "1080p", 3000, 45000.0, true);
            Projector p3 = new Projector();

            System.out.println(p1);
            System.out.println(p1.equals(p2));
            System.out.println(p1.hashCode());
            System.out.println(p2.hashCode());
        }
    }

