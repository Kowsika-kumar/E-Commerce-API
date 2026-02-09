package com.example.Ecom.controller;

import com.example.Ecom.model.Item;
import com.example.Ecom.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/items")
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


    @PostMapping("/add")
    public ResponseEntity<Item> addItem(@Valid @RequestBody Item item) {
        Item item1=itemService.addItem(item);
        return new ResponseEntity<>(item1, HttpStatus.CREATED);
    }


    @GetMapping("/getById/{id}")
    public ResponseEntity<?> getItem(@PathVariable Long id) {
        Item item = itemService.getItemById(id);
        if (item == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Item not found with ID: " + id);
        }
        return ResponseEntity.ok(item);
    }
}
