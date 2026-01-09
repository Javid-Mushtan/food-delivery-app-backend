package com.javid.food_delivery.models;

public enum PaymentMethod {
    CARD("card"),
    CASH_ON_DELIVERY("cash on delivery"),
    UPI("upi"),
    WALLET("wallet");

    private String value;
    PaymentMethod(String value) {
        this.value = value;
    }

}
