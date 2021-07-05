package com.github.fredyspt.ecommerce.model;

import com.github.fredyspt.ecommerce.util.Constant;

import java.util.Map;
import java.util.UUID;

public class User {
    private final String id;
    private String name;
    private String lastName;
    private int phoneNumber;
    private Address address;
    private String email;
    private Payment paymentCard;

    public User(Map<String, Object> dict){
        id = UUID.randomUUID().toString();

        if (dict.containsKey(Constant.KEY_NAME)) {
            this.setName((String) dict.get(Constant.KEY_NAME));
        }

        if (dict.containsKey(Constant.KEY_LAST_NAME)) {
            this.setLastName((String) dict.get(Constant.KEY_LAST_NAME));
        }

        if (dict.containsKey(Constant.KEY_EMAIL)) {
            this.setEmail((String) dict.get(Constant.KEY_EMAIL));
        }

        if (dict.containsKey(Constant.KEY_PHONE_NUMBER)) {
            this.setPhoneNumber((Integer) dict.get(Constant.KEY_PHONE_NUMBER));
        }

        if (dict.containsKey(Constant.KEY_ADDRESS)) {
            this.setAddress((Address) dict.get(Constant.KEY_ADDRESS));
        }

        if (dict.containsKey(Constant.KEY_PAYMENT_CARD)) {
            this.setPaymentCard((Payment) dict.get(Constant.KEY_PAYMENT_CARD));
        }
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
