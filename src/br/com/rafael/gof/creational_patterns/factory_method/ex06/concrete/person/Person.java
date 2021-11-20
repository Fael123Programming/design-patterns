package br.com.rafael.gof.creational_patterns.factory_method.ex06.concrete.person;

import br.com.rafael.gof.creational_patterns.factory_method.ex06.concrete.address.Address;
import br.com.rafael.gof.creational_patterns.factory_method.ex06.enums.Gender;
import br.com.rafael.gof.creational_patterns.factory_method.ex06.abstract_.IPerson;

import java.time.LocalDate;

public class Person implements IPerson {
    private String name;
    private LocalDate dateOfBirth;
    private Address address;
    private Gender gender;

    public Person(String name, LocalDate dateOfBirth, Address address, Gender gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gender = gender;
    }

    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Gender getGender(){
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String getInfo(){
        return "Name: " + name + "\nDate of birth: " + dateOfBirth.toString() + "Address: " + address;
    }
}
