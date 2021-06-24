package com.github.fredyspt.ecommerce.model;

import com.github.fredyspt.ecommerce.util.Constant;

import java.util.Map;

public class Payment {
    private static int counter;
    private final int id;
    private int cardNumber;
    private int cvv;
    private String expirationDate;

    public Payment(Map<String, Object> dict) {
        id = counter++;

        if (dict.containsKey(Constant.KEY_CARD_NUMBER)) {
            this.setCardNumber((Integer) dict.get(Constant.KEY_CARD_NUMBER));
        }
        if (dict.containsKey(Constant.KEY_CVV)) {
            this.setCvv((Integer) dict.get(Constant.KEY_CVV));
        }
        if (dict.containsKey(Constant.KEY_EXPIRATION_DATE)) {
            this.setExpirationDate((String) dict.get(Constant.KEY_EXPIRATION_DATE));
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
