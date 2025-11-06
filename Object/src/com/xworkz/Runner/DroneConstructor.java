package com.xworkz.Runner;

import com.xworkz.Internal.Drone;

public class DroneConstructor {
    public static void  main(String [] args){


        Drone drone=new Drone(25000,"60 km/h",900l);
        System.out.println(drone.price);
        System.out.println(drone.speed);
        System.out.println(drone.range);
        System.out.println(drone);

       Drone drone1=new Drone("1hour",true);
       System.out.println(drone1.battery);
       System.out.println(drone1.isAvailable);



       Drone drone2=new Drone();



    }
    }
