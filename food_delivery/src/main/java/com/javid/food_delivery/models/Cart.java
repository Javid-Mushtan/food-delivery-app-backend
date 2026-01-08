package com.javid.food_delivery.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "carts")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cart {

    @Id
    private String id;
    private String userId;
    private String userName;
    private List<CartItem> cartItems;
    private BigDecimal totalAmount = cartItems.stream().map(CartItem::getTotalPrice).reduce(BigDecimal.ZERO, BigDecimal::add);

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

}
