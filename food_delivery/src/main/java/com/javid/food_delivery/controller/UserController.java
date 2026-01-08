package com.javid.food_delivery.controller;

import com.javid.food_delivery.dto.RegisterRequestDTO;
import com.javid.food_delivery.dto.RegisterResponeDTO;
import com.javid.food_delivery.models.User;
import com.javid.food_delivery.repository.UserRepository;
import com.javid.food_delivery.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<RegisterResponeDTO> createUser(@RequestBody RegisterRequestDTO user) {
        return userService.createUser(user);
    }

    @GetMapping("/all")
    public ResponseEntity<List<RegisterResponeDTO>> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/{email}")
    public ResponseEntity<RegisterResponeDTO> getUserByEmail(@PathVariable String email) {
        return new ResponseEntity<>(userService.getUserByEmail(email), HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<RegisterResponeDTO> updateUser(@RequestBody RegisterRequestDTO user, @PathVariable String id) {
        return new ResponseEntity<>(userService.updateUser(user,id),HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllUser() {
        userService.deleteAllUsers();
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
