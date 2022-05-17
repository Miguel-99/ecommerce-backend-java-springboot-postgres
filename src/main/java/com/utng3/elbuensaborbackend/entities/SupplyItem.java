package com.utng3.elbuensaborbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Entity
@Table(name = "supply_items")
public class SupplyItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denomination;
    private String description;
    private int stock;
    private int minStock;
    private int maxStock;
    private String measurementUnit;

    @JsonIgnore
    @ManyToMany(mappedBy = "supplyItems")
    private List<ManufacturedItem> manufacturedItem;
}
