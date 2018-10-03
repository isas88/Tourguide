package com.example.isas88.tourguide;

public class Restaurant {

    private String restaurantName;
    private String restaurantAddress;
    private String restaurantDesc;

    //constructor
    public Restaurant(String name, String address, String desc) {
        this.restaurantName      =   name;
        this.restaurantAddress   =   address;
        this.restaurantDesc      =   desc;
    }

    //getters
    public String getrestaurantName() {return restaurantName; }

    public String getrestaurantAddress() {return restaurantAddress; }

    public String getrestaurantDesc() { return restaurantDesc; }

}