package com.javid.food_delivery.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {

    private String menuItemId;
    private String name;
    private BigDecimal price;
    private Long quantity;
    private BigDecimal totalPrice = price.multiply(new BigDecimal(quantity));
}
