package com.github.fredyspt.ecommerce.model;

import java.util.UUID;

public class User {
    private final String id;
    private String name;
    private String lastName;
    private int phoneNumber;
    private Address address;
    private String email;
    private Payment paymentCard;

    public User(String name, String lastName, String email){
        id = UUID.randomUUID().toString();
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public String getId() {
        return id;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Payment getPaymentCard() {
        return paymentCard;
    }

    public void setPaymentCard(Payment paymentCard) {
        this.paymentCard = paymentCard;
    }
}
