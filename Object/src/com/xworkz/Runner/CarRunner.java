package com.xworkz.Runner;

import com.xworkz.Internal.Car;

public class CarRunner {


        public static void main(String[] args) {
            Car car = new Car("Tesla", 5500000, "White");
            System.out.println(car);

            Car car1 = new Car(true);
            System.out.println("Automatic: " + car1.isAutomatic);

            Car car2 = new Car();
        }

}
