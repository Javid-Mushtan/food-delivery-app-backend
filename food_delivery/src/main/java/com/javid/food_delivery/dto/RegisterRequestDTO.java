package com.javid.food_delivery.dto;

import com.javid.food_delivery.models.Address;
import com.javid.food_delivery.models.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequestDTO {

    private String username;

    private String email;

    private String password;

    private String phone;

    private UserRole role = UserRole.CUSTOMER;  // Default value

    private List<Address> addresses = new ArrayList<>();
}
