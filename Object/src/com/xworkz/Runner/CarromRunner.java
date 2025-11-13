package com.xworkz.Runner;

import com.xworkz.Internal.Carrom;

public class CarromRunner {
    public  static  void main(String[] args){

        Carrom carrom=new Carrom(2000,"30*30 inch","10 points","5 points","25 points");
        System.out.println(carrom);

        Carrom carrom1=new Carrom(2000,"30*30 inch","10 points","5 points","25 points");

        System.out.println(carrom.equals(carrom1));
        System.out.println(carrom.hashCode());
    }

}
