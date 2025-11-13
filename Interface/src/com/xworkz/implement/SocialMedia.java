package com.xworkz.implement;

import com.xworkz.internal.Telegram;
import com.xworkz.internal.WhatsApp;

public class SocialMedia implements WhatsApp, Telegram {
    @Override
    public void sendMessage() {
        System.out.println("Message sent through WhatsApp...");
    }

    @Override
    public boolean isOnline() {
        return true;
    }

    @Override
    public void sendFile() {
        System.out.println("File sent through Telegram");
    }

    @Override
    public int maxFileSize() {
        return 2048;
    }
}
