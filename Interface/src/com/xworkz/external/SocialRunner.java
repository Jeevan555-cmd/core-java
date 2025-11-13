package com.xworkz.external;

import com.xworkz.implement.SocialMedia;
import com.xworkz.internal.Telegram;
import com.xworkz.internal.WhatsApp;

public class SocialRunner {
    public static void main(String[] args) {
        WhatsApp w = new SocialMedia();
        w.sendMessage();
        System.out.println(w.isOnline());

        Telegram t = new SocialMedia();
        t.sendFile();
        System.out.println(t.maxFileSize());
    }
}
