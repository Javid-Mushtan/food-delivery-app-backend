package com.javid.food_delivery.models;

public enum PaymentStatus {
    PAID("paid"),
    UNPAID("unpaid");

    private String value;
    PaymentStatus(String value) {
        this.value = value;
    }
}
