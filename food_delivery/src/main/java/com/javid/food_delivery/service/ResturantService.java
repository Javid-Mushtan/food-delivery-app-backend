package com.javid.food_delivery.service;

import com.javid.food_delivery.models.Resturant;
import com.javid.food_delivery.repository.ResturantRepository;
import com.javid.food_delivery.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResturantService {

    private final ResturantRepository resturantRepository;

    public Resturant createResturant(Resturant resturant) {
        return resturantRepository.save(resturant);
    }

    public List<Resturant> getAllResturants() {
        return resturantRepository.findAll();
    }

}
