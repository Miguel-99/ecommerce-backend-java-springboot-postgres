package com.utng3.elbuensaborbackend.services;

import com.utng3.elbuensaborbackend.entities.SupplyItem;
import com.utng3.elbuensaborbackend.repositories.SupplyItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class SupplyItemService {
    private final SupplyItemRepository supplyItemRepository;

    public List<SupplyItem> findAll() {
        return supplyItemRepository.findAll();
    }

    public SupplyItem findOne(Long id) {
        return supplyItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("resource doesn't exist"));
    }

    public SupplyItem createOne(SupplyItem entity) {
        return supplyItemRepository.save(entity);
    }

    public SupplyItem update(Long id, SupplyItem entity) {
        SupplyItem updatedEntity = supplyItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("resource doesn't exists"));
        return supplyItemRepository.save(updatedEntity);
    }

    public boolean delete(Long id) {
        SupplyItem deletedEntity = supplyItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("resource doesn't exists"));
        supplyItemRepository.delete(deletedEntity);
        return true;
    }
}
