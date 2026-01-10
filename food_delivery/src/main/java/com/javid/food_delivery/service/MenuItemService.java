package com.javid.food_delivery.service;

import com.javid.food_delivery.models.MenuItem;
import com.javid.food_delivery.repository.MenuItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuItemService {

    private final MenuItemRepository menuItemRepository;

    public MenuItem addMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    public List<MenuItem> getMenuItemsByRestaurant(String resturantId) {
        return menuItemRepository.findByResturantId(resturantId);
    }

    public MenuItem getMenuItemById(String id) {
        return menuItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Menu item not found"));
    }

    public MenuItem updateMenuItem(String id, MenuItem updatedItem) {
        MenuItem existing = getMenuItemById(id);

        existing.setName(updatedItem.getName());
        existing.setDescription(updatedItem.getDescription());
        existing.setPrice(updatedItem.getPrice());
        existing.setCategory(updatedItem.getCategory());
        existing.setImageUrl(updatedItem.getImageUrl());
        existing.setIsAvailable(updatedItem.getIsAvailable());

        return menuItemRepository.save(existing);
    }

    public void deleteMenuItem(String id) {
        menuItemRepository.deleteById(id);
    }
}
