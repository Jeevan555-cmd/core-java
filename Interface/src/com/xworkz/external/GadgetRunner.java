package com.xworkz.external;

import com.xworkz.implement.Gadget;
import com.xworkz.internal.Camera;
import com.xworkz.internal.Drone;

public class GadgetRunner {
    public static void main(String[] args) {

        Camera camera = new Gadget();
        camera.capture();

        Drone drone = new Gadget();
        drone.fly();
    }
}
