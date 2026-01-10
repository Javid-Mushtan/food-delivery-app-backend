package com.javid.food_delivery.controller;

import com.javid.food_delivery.models.Resturant;
import com.javid.food_delivery.repository.ResturantRepository;
import com.javid.food_delivery.service.ResturantService;
import com.javid.food_delivery.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/resturant")
public class ResturantController {

    private final ResturantService resturantService;

    @PostMapping
    public ResponseEntity<Resturant> createResturant(@RequestBody Resturant resturant) {
        return new ResponseEntity<>(resturantService.createResturant(resturant), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Resturant>> findAllResturants() {
        return ResponseEntity.ok(resturantService.getAllResturants());
    }

}
