package com.github.fredyspt.ecommerce.model;

import com.github.fredyspt.ecommerce.util.Constant;

import java.util.Map;
import java.util.UUID;

public class Payment {
    private static int counter;
    private final int id;
    private int cardNumber;
    private int cvv;
    private String expirationDate;

    public Payment(Map<String, Object> dict) {
        id = counter++;

        if (dict.containsKey(Constant.KEY_NAME)) {
            this.setCardNumber((Integer) dict.get(Constant.KEY_NAME));
        }
        if (dict.containsKey(Constant.KEY_NAME)) {
            this.setCvv((Integer) dict.get(Constant.KEY_NAME));
        }
        if (dict.containsKey(Constant.KEY_NAME)) {
            this.setExpirationDate((String) dict.get(Constant.KEY_NAME));
        }
    }

    public int getId() {
        return id;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

}
