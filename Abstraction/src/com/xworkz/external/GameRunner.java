package com.xworkz.external;

import com.xworkz.imp.Cricket;
import com.xworkz.internal.Game;


public class GameRunner {
    public static void main(String[] args) {
        Game g = new Cricket();
        g.start();
        g.play();
        g.exit();
        Game.players();
    }
}
