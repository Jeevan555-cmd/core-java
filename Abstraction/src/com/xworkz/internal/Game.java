package com.xworkz.internal;

public  abstract class Game {
    public abstract void start();

    public abstract void play();
    public void exit() {

        System.out.println("Game exited");
    }
    public  static  void players(){
        System.out.println("no of Players required is:");
    }

}

