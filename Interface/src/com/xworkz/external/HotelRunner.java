package com.xworkz.external;

import com.xworkz.implement.Hotel;
import com.xworkz.internal.Chef;
import com.xworkz.internal.Waiter;

public class HotelRunner {
    public static void main(String[] args) {

        Chef chef = new Hotel();
        chef.cook();

        Waiter waiter = new Hotel();
        waiter.serve();
    }
}
