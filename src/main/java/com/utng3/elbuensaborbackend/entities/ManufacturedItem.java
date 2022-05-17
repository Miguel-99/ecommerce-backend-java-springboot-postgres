package com.utng3.elbuensaborbackend.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "manufactured_items")
public class ManufacturedItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private int amount;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "manufactured_items_supply_items",
        joinColumns = @JoinColumn(name = "manufactured_item_id"),
        inverseJoinColumns = @JoinColumn(name = "supply_item_id"))
    private List<SupplyItem> supplyItems;
}
