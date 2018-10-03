package com.example.isas88.tourguide;

public class Mall {

    private String mallName;
    private String mallAddress;
    private String mallDesc;

    //constructor
    public Mall(String name, String address, String desc) {
        this.mallName      =   name;
        this.mallAddress   =   address;
        this.mallDesc      =   desc;
    }

    //getters
    public String getmallName() {return mallName; }

    public String getmallAddress() {return mallAddress; }

    public String getmallDesc() { return mallDesc; }

}