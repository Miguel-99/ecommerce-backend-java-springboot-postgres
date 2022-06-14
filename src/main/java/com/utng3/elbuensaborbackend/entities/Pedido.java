package com.utng3.elbuensaborbackend.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "pedidos_productosManufacturados",
            joinColumns = @JoinColumn(name = "pedido_id"),
            inverseJoinColumns = @JoinColumn(name = "prductoManufacturado_id"))
    private List<ProductoManufacturado> productos;


    private int tiempoEstimadoMinutos;

}
