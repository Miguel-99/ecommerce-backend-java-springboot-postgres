package com.utng3.elbuensaborbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "productoManufacturado")
public class ProductoManufacturado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String descripcion;

    //tiempoEstimadoPreparacion en minutos
    private int tiempoEstimadoPreparacion;

    private String detallePreparacion;

    @OneToOne
    @JoinColumn(name = "fk_rubroGeneral")
    private RubroGeneral rubroGeneral;

    @OneToMany(mappedBy = "productoManufacturado")
    private List<ProductoManufacturadoArtculoInsumo> articuloConCantidad;

    @OneToMany(mappedBy = "productoManufacturado")
    private List<PrecioArticuloManufacturado> historialPrecios;


    @JsonIgnore
    @ManyToMany(mappedBy = "productos")
    private List<Pedido> pedidos;

}
