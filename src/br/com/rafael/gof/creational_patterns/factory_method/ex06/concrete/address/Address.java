package br.com.rafael.gof.creational_patterns.factory_method.ex06.concrete.address;

public class Address {
    private String country, state, city;
    private String street;
    private int number;

    public Address(String country, String state, String city, String street, int number) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString(){
        return "Country: " + country + "\tState: " + state + "\tCity: " + city + "\tNumber: " + number;
    }
}
