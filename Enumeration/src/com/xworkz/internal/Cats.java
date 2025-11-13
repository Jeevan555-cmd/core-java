package com.xworkz.internal;

public enum Cats {
    PERSIAN(4000,"Punch Face and Doll faces"),RUSSIAN(5000,"Crazyy"),SIAMESE(6000,"Dance"),RAGDOLL(6000,"faster"),SCOTTISH(7000,"cute"),HIMALAYAN(8000,"snowy"),BENGAL(4000,"faster"),BRITISH(9000,"Cutest");

    int price;
    String feature;


    private Cats(int price,String feature){
        this.price=price;
        this.feature=feature;

    }
    public int getPrice(){
        return price;
    }
    public  String getFeature(){
        return feature;

    }
}
