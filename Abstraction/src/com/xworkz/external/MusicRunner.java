package com.xworkz.external;

import com.xworkz.imp.Spotify;
import com.xworkz.internal.MusicPlayer;

public class MusicRunner {
    public static void main(String[] args) {
        MusicPlayer m = new Spotify();
        m.playSong();
        m.pause();
        m.stop();
    }

}
