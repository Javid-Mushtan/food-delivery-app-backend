package com.javid.food_delivery.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private String streetAddress;
    private String city;
    private String province;
    private String zipCode;

}
