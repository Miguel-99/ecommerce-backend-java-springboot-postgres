package com.utng3.elbuensaborbackend.controllers;

import com.utng3.elbuensaborbackend.entities.ManufacturedItem;
import com.utng3.elbuensaborbackend.services.ManufacturedItemService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1.0/manufactured-item")
@AllArgsConstructor
public class ManufacturedItemController {

    protected final ManufacturedItemService manufacturedItemService;

    @GetMapping
    public ResponseEntity<List<ManufacturedItem>> findAll() {
        return ResponseEntity.ok(manufacturedItemService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ManufacturedItem> findOne(@PathVariable Long id) {
        return ResponseEntity.ok(manufacturedItemService.findOne(id));
    }

    @PostMapping
    public ResponseEntity<ManufacturedItem> createOne(@RequestBody ManufacturedItem manufacturedItem) {
        return ResponseEntity.ok(manufacturedItemService.createOne(manufacturedItem));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ManufacturedItem> updateOne(@PathVariable Long id, @RequestBody ManufacturedItem manufacturedItem) {
        return ResponseEntity.ok(manufacturedItemService.update(id, manufacturedItem));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOne(@PathVariable Long id) {
        manufacturedItemService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
