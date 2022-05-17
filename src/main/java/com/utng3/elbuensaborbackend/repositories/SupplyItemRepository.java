package com.utng3.elbuensaborbackend.repositories;

import com.utng3.elbuensaborbackend.entities.SupplyItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplyItemRepository extends JpaRepository<SupplyItem, Long> {
}
