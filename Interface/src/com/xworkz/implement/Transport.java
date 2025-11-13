package com.xworkz.implement;

import com.xworkz.internal.Flight;
import com.xworkz.internal.Train;

public class Transport implements Flight, Train {

    public void bookTicket() {
        System.out.println("Train ticket booked");
    }
    public void checkIn() {
        System.out.println("Flight check-in successful");
    }
}
