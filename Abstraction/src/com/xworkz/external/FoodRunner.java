package com.xworkz.external;

import com.xworkz.imp.Swiggy;
import com.xworkz.internal.FoodApp;

public class FoodRunner {
    public static void main(String[] args) {
        FoodApp app = new Swiggy();
        app.orderFood();
        app.payment();
    }
}
