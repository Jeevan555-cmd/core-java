package com.xworkz.external;

import com.xworkz.implement.Devices;
import com.xworkz.internal.Laptop;
import com.xworkz.internal.Mobile;

public class DeviceRunner {
    public static void main(String[] args) {

        Laptop laptop = new Devices();
        laptop.runApplication();

        Mobile mobile = new Devices();
        mobile.call();
    }
}
