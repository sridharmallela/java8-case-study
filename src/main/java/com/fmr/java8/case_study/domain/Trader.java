package com.fmr.java8.case_study.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trader {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long traderId;

    String firstName = "";

    String lastName = "";

    String email = "";

    String phoneNum = "";

    String address = "";

    String city = "";

    String zipCode = "";

    protected Trader() {
    }

    public Trader(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getTraderId() {
        return traderId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }
}
