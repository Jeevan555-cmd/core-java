package com.xworkz.internal;

public class SmartSpeaker {

        public String brand;
        public String model;
        public boolean hasVoiceAssistant;
        public double price;
        public String connectivity;

        public SmartSpeaker(String brand, String model, boolean hasVoiceAssistant, double price, String connectivity) {
            this.brand = brand;
            this.model = model;
            this.hasVoiceAssistant = hasVoiceAssistant;
            this.price = price;
            this.connectivity = connectivity;
            System.out.println("It is All args Constructor");
        }

        public SmartSpeaker(String brand, double price) {
            this.brand = brand;
            this.price = price;
            System.out.println("It is 2 args Constructor");
        }

        public SmartSpeaker() {
            System.out.println("It is no args Constructor");
        }

        @Override
        public String toString() {
            return "{Brand:" + brand + ", Model:" + model + ", VoiceAssistant:" + hasVoiceAssistant + ", Price:" + price + ", Connectivity:" + connectivity + "}";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj instanceof SmartSpeaker) {
                SmartSpeaker s = (SmartSpeaker) obj;
                return this.brand.equals(s.brand) &&
                        this.model.equals(s.model) &&
                        this.hasVoiceAssistant == s.hasVoiceAssistant &&
                        this.price == s.price &&
                        this.connectivity.equals(s.connectivity);
            }
            return false;
        }

        @Override
        public int hashCode() {
            int prime = 7;
            int result = 1;
            result = prime * result + (hasVoiceAssistant ? 1 : 0);
            return result;
        }
    }

