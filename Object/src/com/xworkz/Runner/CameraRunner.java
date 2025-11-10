package com.xworkz.Runner;

import com.xworkz.Internal.Camera;

public class CameraRunner {

        public static void main(String[] args) {
            Camera c1 = new Camera("Canon", 24.2, 10, 45000.0, true);
            System.out.println(c1.brand);
            System.out.println(c1.megapixels);
            System.out.println(c1.zoom);
            System.out.println(c1);
            Camera c2 = new Camera("Canon", 24.2, 10, 45000.0, true);
            Camera c3 = new Camera();
            System.out.println(c1.equals(c2));
        }


}
