package com.utng3.elbuensaborbackend.entities;

import lombok.*;

import javax.persistence.*;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "productoManufacturado_articuloInsumo")
public class ProductoManufacturadoArtculoInsumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "fk_articuloInsumo")
    private ArticulosInsumo articuloInsumo;

    @ManyToOne
    @JoinColumn(name = "fk_productoManufacturado")
    private ProductoManufacturado productoManufacturado;

    private int cantidad;


}
