package com.xworkz.imp;

import com.xworkz.internal.MusicPlayer;

public class Spotify extends MusicPlayer {
    @Override
     public  void playSong() {
        System.out.println("Spotify is playing a song...");
    }

    @Override
   public void pause() {
        System.out.println("Spotify paused the song");
    }
}
