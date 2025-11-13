package com.xworkz.internal;

public enum State {
    Karnataka("Infosys, Wipro, TCS"),
    Maharashtra("Tech Mahindra, Capgemini, Cognizant"),
    TamilNadu("Zoho, TCS, Infosys"),
    Telangana("Microsoft, Google, Amazon"),
    Kerala("UST Global, IBS Software"),
    Gujarat("TCS, Cybage, eInfochips"),
    Delhi("HCL, IBM, Accenture");

    private String itCompanies;


    private State(String itCompanies) {
        this.itCompanies = itCompanies;
    }


    public String getItCompanies() {
        return itCompanies;
    }
}
