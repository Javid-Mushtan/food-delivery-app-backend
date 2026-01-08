package com.javid.food_delivery.dto;

import com.javid.food_delivery.models.Address;
import com.javid.food_delivery.models.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterResponeDTO {
    private String username;

    private String email;

    private String phone;

    private UserRole role;

}
