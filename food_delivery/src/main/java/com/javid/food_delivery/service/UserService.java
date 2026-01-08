package com.javid.food_delivery.service;

import com.javid.food_delivery.dto.RegisterRequestDTO;
import com.javid.food_delivery.dto.RegisterResponeDTO;
import com.javid.food_delivery.models.Address;
import com.javid.food_delivery.models.User;
import com.javid.food_delivery.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public ResponseEntity<RegisterResponeDTO> createUser(RegisterRequestDTO user) {
        User userEntity = mapToUser(user);
        userRepository.save(userEntity);
        return new ResponseEntity<>(
                new RegisterResponeDTO(
                        userEntity.getUsername(),
                        userEntity.getEmail(),
                        userEntity.getPhone(),
                        userEntity.getRole()
                ), HttpStatus.OK);
    }

    public User mapToUser(RegisterRequestDTO user) {
        User newUser = new User();
        newUser.setEmail(user.getEmail());
        newUser.setPhone(user.getPhone());
        newUser.setUsername(user.getUsername());
        newUser.setPassword(user.getPassword());
        newUser.setAddresses(user.getAddresses());
        newUser.setRole(user.getRole());
        newUser.setAddresses(user.getAddresses());
        return newUser;
    }

    public RegisterResponeDTO reverseMap(User user) {
        RegisterResponeDTO response = new RegisterResponeDTO();
        response.setEmail(user.getEmail());
        response.setPhone(user.getPhone());
        response.setUsername(user.getUsername());
        response.setRole(user.getRole());
        return response;
    }

    public List<RegisterResponeDTO> getAllUsers() {
        List<User> allUsers = userRepository.findAll();
        List<RegisterResponeDTO> response = new ArrayList<>();
        for (User user : allUsers) {
            response.add(reverseMap(user));
        }
        return response;
    }

    public RegisterResponeDTO getUserByEmail(String email) {
         User user = userRepository.findByEmail(email);
        return new RegisterResponeDTO(user.getUsername(), user.getEmail(), user.getPhone(), user.getRole());
    }

    public RegisterResponeDTO updateUser(RegisterRequestDTO user,String id) {
        User userEntity = userRepository.findById(id)
                        .orElseThrow();
        userRepository.save(userEntity);
        return new RegisterResponeDTO(userEntity.getUsername(), user.getEmail(), user.getPhone(), user.getRole());
    }

    public void deleteAllUsers() {
        userRepository.deleteAll();
    }
}
