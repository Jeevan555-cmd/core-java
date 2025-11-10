package com.xworkz.Runner;

import com.xworkz.Internal.Laptop;

public class LaptopConstructor {

        public static void main(String[] args) {
            Laptop laptop = new Laptop("HP", 65000, "Intel i7");
            System.out.println(laptop);

            Laptop laptop1 = new Laptop(true);
            System.out.println(laptop1.isAvailable);

            Laptop laptop2 = new Laptop();
        }

}
