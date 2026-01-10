package com.javid.food_delivery.repository;

import com.javid.food_delivery.models.MenuItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuItemRepository extends MongoRepository<MenuItem, String> {

    List<MenuItem> findByResturantId(String resturantId);

    List<MenuItem> findByNameContainingIgnoreCase(String keyword);

    List<MenuItem> findByIsAvailableTrue();
}