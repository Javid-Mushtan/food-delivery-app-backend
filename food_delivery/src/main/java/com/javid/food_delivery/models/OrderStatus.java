package com.javid.food_delivery.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
public enum OrderStatus {

    PLACED("placed"),
    CONFIRMED("confirmed"),
    PREPARING("preparing"),
    OUT_OF_DELIVERY("out of delivery"),
    DELIVERED("delivered"),
    CANCELLED("cancelled");

    private final String label;

    OrderStatus(String str) {
        label = str;
    }
}
