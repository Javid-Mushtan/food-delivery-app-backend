package com.javid.food_delivery.models;

public enum UserRole {
    CUSTOMER("customer"),
    ADMIN("admin");

    private final String user_role;

    UserRole(String roleName) {
        this.user_role = roleName;
    }

    public String getUser_role() {
        return user_role;
    }
}