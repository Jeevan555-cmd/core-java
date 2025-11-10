package com.xworkz.Runner;
import com.xworkz.Internal.Tv;
public class TvRunner {

        public static void main(String[] args) {
            Tv tv1 = new Tv("LG", 55, true, 55999.0, "4K");
            System.out.println(tv1.brand);
            System.out.println(tv1.size);
            System.out.println(tv1.isSmart);
            System.out.println(tv1);
            Tv tv2 = new Tv("LG", 55, true, 55999.0, "4K");
            Tv tv3 = new Tv();
            System.out.println(tv1.equals(tv2));
        }
    }


