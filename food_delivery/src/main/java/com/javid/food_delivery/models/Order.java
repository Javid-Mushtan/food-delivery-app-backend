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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "orders")
public class Order {
    @Id
    private String id;

    private String orderNumber;
    private String userId;
    private String resturantId;
    private List<CartItem> cartItems;
    private BigDecimal totalPrice = cartItems.stream().map(CartItem::getTotalPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    private BigDecimal deliveryFee;
    private BigDecimal totalAmount = totalPrice.add(deliveryFee);
    private OrderStatus orderStatus;
    private PaymentStatus paymentStatus = PaymentStatus.UNPAID;
    private Address address;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}