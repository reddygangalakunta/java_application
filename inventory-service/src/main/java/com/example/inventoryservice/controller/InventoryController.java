package com.example.inventoryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @GetMapping("/inventory")
    public String getInventory() {
        return "List of inventory items";
    }
}
