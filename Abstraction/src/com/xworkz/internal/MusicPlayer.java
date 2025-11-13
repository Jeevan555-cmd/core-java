package com.xworkz.internal;

public abstract class MusicPlayer {
    public abstract void playSong();
   public abstract void pause();

    public void stop() {
        System.out.println("Stopped playing");
    }
}

