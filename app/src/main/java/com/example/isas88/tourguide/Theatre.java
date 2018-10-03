package com.example.isas88.tourguide;

public class Theatre {

    private String theatreName;
    private String theatreAddress;
    private String theatreDesc;

    //constructor
    public Theatre(String name, String address, String desc) {
        this.theatreName      =   name;
        this.theatreAddress   =   address;
        this.theatreDesc      =   desc;
    }

    //getters
    public String gettheatreName() {return theatreName; }

    public String gettheatreAddress() {return theatreAddress; }

    public String gettheatreDesc() { return theatreDesc; }

}