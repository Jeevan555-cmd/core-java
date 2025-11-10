package com.xworkz.internal;

public class Playstation {
     public int price;
   public String brand;
     public  long idNo;
     public char version;
   public boolean isAvailalbe;

    public Playstation( int price,String brand){
        System.out.println("The price of the Playstation is"+price);
        System.out.println("The brand of the Playstation :"+brand);



    }
    public Playstation(long idNo, char version, boolean isAvailalbe){
        System.out.println("The idNo of the Playstation is: "+idNo);
        System.out.println("The Version of the Playstation is:"+version);
        System.out.println("The Playstation is Available :"+isAvailalbe);
    }
}
