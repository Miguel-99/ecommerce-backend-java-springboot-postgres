package com.utng3.elbuensaborbackend.repositories;

import com.utng3.elbuensaborbackend.entities.ManufacturedItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturedItemRepository extends JpaRepository<ManufacturedItem, Long> {
}
