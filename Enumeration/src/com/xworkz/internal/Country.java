package com.xworkz.internal;

public enum Country {
    India(91,"Hindi"),Pakistan(92,"Urdu"),
    Dubai(971,"Arabic"),China(86,"Chinese"),Srilanka(94,"Sinhala"),Bangladesh(880,"Bengali"),Thailand(66,"Thai"),Bhutan(975,"Dzonghka");

    int countryCode;
    String language;

    private  Country(int countryCode,String language){
        this.countryCode=countryCode;
        this.language=language;


    }
    public   int getCountryCode(){
        return countryCode;
    }
    public String getLanguage(){
        return language;
    }
}
