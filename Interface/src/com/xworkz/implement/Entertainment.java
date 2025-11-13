package com.xworkz.implement;

import com.xworkz.internal.Radio;
import com.xworkz.internal.TV;

public class Entertainment implements TV, Radio {
    @Override
    public void playChannel() {
        System.out.println("Playing TV Channel...");
    }
    @Override
    public int volume() {
        return 45;
    }
    @Override
    public void tuneFrequency() {
        System.out.println("Tuned to FM Radio");
    }
    @Override
    public boolean isFM() {
        return true;
    }
}
