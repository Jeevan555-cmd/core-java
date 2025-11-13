package com.xworkz.Internal;

public class Carrom {
    int price;
    String size;
    String white;
    String black;
    String queen;

    public  Carrom(int price, String size,String white, String black, String queen){
        this.price=price;
        this.size=size;
        this.white=white;
        this.black=black;
        this.queen=queen;
        System.out.println("All args Constructor" );

    }
    public  String toString(){
        return "{Carrom price:"+price+"Size:"+size+"White points:"+white+"Black Points:"+black+"Queen points:"+queen+"}";

    }
    public boolean equals(Object obj) {
        if(this == obj)
            return  true;
        if (obj instanceof Carrom ){
            Carrom carrom2=(Carrom) obj;
            return
                    this.price==(carrom2.price) &&
                            this.size.equals(carrom2.size) &&
                            this.white.equals(carrom2.white)&&
                            this.black.equals(carrom2.black) &&
                            this.queen.equals(carrom2.queen);
        }
        return false;
    }

   public int hashCode(){
        int prime=7;
        int result=1;
        result=prime*result+ price;
        return  result;

   }

}
