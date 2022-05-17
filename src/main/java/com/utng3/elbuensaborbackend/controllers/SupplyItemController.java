package com.utng3.elbuensaborbackend.controllers;


import com.utng3.elbuensaborbackend.entities.SupplyItem;
import com.utng3.elbuensaborbackend.services.SupplyItemService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@AllArgsConstructor
@RequestMapping("api/v1.0/supply-item")
public class SupplyItemController {
    private final SupplyItemService supplyItemService;

    @GetMapping
    public ResponseEntity<List<SupplyItem>> getAll() {
        return ResponseEntity.ok(supplyItemService.findAll());
    }

    @PostMapping
    public ResponseEntity<SupplyItem> createOne(@RequestBody SupplyItem supplyItem) {
        return ResponseEntity.ok(supplyItemService.createOne(supplyItem));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOne(@PathVariable Long id) {
        supplyItemService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
