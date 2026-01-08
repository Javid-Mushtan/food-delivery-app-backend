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
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "resturants")
public class Resturant {

    @Id
    private String id;
    private String name;
    private String description;
    private Address address;
    private String phone;
    private String email;
    private String imageUrl;
    private BigDecimal rating;
    private Boolean isOpen;
    private Date openingTime;
    private Date closingTime;
    private BigDecimal deliveryFee;
    private Long estimatedDeliveryFee;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}
