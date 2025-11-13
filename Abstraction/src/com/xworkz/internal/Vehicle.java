package com.xworkz.internal;

public abstract class Vehicle {

        public abstract void start();

        public void stop() {

            System.out.println("Vehicle stopped");
        }

        public static void exhaust(){
            System.out.println("The exhaust used is:");
        }

}
