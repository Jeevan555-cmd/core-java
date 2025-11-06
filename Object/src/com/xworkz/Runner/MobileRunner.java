package com.xworkz.Runner;

import com.xworkz.Internal.Mobile;

public class MobileRunner {

        public static void main(String[] args) {
            Mobile mobile = new Mobile("Samsung", 25000, "128GB");
            System.out.println(mobile);

            Mobile mobile1 = new Mobile(true);
            System.out.println("5G Supported: " + mobile1.is5G);

            Mobile mobile2 = new Mobile();
        }

}
