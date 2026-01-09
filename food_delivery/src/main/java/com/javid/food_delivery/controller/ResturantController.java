package com.javid.food_delivery.controller;

import com.javid.food_delivery.models.Resturant;
import com.javid.food_delivery.repository.ResturantRepository;
import com.javid.food_delivery.service.ResturantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/resturant")
public class ResturantController {

    private final ResturantService resturantService;

    @PostMapping
    public Resturant createResturant(@RequestBody Resturant resturant) {
        return resturantService.createResturant(resturant);
    }
}
