package com.example.demo.dao;

public class Profile {

    String name;
    String lastName;
    String country;
    String imageUrl;

    public Profile(String name, String lastName, String country, String imageUrl) {
        this.name = name;
        this.lastName = lastName;
        this.country = country;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
