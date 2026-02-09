package com.example.Ecom.service;

import com.example.Ecom.model.Item;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ItemService {
    private final List<Item> items = new ArrayList<>();


    public Item addItem(Item item) {
        items.add(item);
        return item;
    }


    public Item getItemById(Long id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
}
