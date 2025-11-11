package com.xworkz.Internal;

public class Drone {
    public int price;
    public String speed;
    public long range;
    public String battery;
    public boolean isAvailable;


    public Drone(int price,String speed,long range){
        this.price=price;
        this.speed=speed;
        this.range=range;

        System.out.println("It is All args Constructor");
    }
    public Drone(String battery, boolean isAvailable){
        this.battery=battery;
        this.isAvailable=isAvailable;

        System.out.println("It is 2 args Constructor");
    }

    public Drone(){
        System.out.println("It is no args Constructor");
    }

    @Override
    public String toString() {
        return "{Price:"+price+"Speed:"+speed+"Range:"+range+"}";

    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Drone) {
            Drone drone3 = (Drone) obj;
            return this.price == drone3.price &&
                    this.range == drone3.range &&
                    this.speed.equals(drone3.speed) ;




        }
        return false;
    }

    public int hashCode(){
        int prime=7;
        int result=1;
        result=prime*result +price;

        return result;


    }




}
