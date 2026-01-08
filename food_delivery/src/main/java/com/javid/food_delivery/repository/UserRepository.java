package com.javid.food_delivery.repository;

import com.javid.food_delivery.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,Object> {
    User findByEmail(String email);
}
