package com.javid.food_delivery.repository;

import com.javid.food_delivery.models.Resturant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResturantRepository extends MongoRepository<Resturant,String> {
}
