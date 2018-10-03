package com.example.isas88.tourguide;

public class Beach {

    private String beachName;
    private String beachAddress;
    private String beachImage1;
    private String beachImage2;
    private String beachDesc;

    //constructor
    public Beach(String name, String address, String image1, String image2, String desc) {
        this.beachName      =   name;
        this.beachAddress   =   address;
        this.beachImage1    =   image1;
        this.beachImage2    =   image2;
        this.beachDesc      =   desc;
    }

    //getters
    public String getBeachName() {
        return beachName;
    }

    public String getBeachAddress() {
        return beachAddress;
    }

    public String getBeachImage1() {return beachImage1; }

    public String getBeachImage2() {return beachImage2; }

    public String getBeachDesc() { return beachDesc; }

}