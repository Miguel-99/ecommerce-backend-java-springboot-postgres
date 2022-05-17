package com.utng3.elbuensaborbackend.services;

import com.utng3.elbuensaborbackend.entities.ManufacturedItem;
import com.utng3.elbuensaborbackend.repositories.ManufacturedItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ManufacturedItemService {
    private ManufacturedItemRepository manufacturedItemRepository;

    public List<ManufacturedItem> findAll() {
        return manufacturedItemRepository.findAll();
    }

    public ManufacturedItem findOne(Long id) {
        return manufacturedItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("resource doesn't exist"));
    }

    public ManufacturedItem createOne(ManufacturedItem manufacturedItem) {
        return manufacturedItemRepository.save(manufacturedItem);
    }

    public ManufacturedItem update(Long id, ManufacturedItem manufacturedItem) {
        ManufacturedItem updatedEntity = manufacturedItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("resource doesn't exists"));

        updatedEntity.setName((manufacturedItem.getName()));
        updatedEntity.setSupplyItems(manufacturedItem.getSupplyItems());
        updatedEntity.setDescription(manufacturedItem.getDescription());
        updatedEntity.setAmount(manufacturedItem.getAmount());

        return manufacturedItemRepository.save(updatedEntity);
    }

    public boolean delete(Long id) {
        ManufacturedItem deletedEntity = manufacturedItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("resource doesn't exists"));
        manufacturedItemRepository.delete(deletedEntity);
        return true;
    }
}
