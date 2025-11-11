package com.xworkz.internal;

public enum Days {
    MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);

    int number;
    private Days(int number){
        this.number=number;

    }
    public int getNumber(){
        return number;
    }

}
