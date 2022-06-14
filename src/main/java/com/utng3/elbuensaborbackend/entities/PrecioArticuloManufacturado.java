package com.utng3.elbuensaborbackend.entities;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "precioArticuloManufacturado")
public class PrecioArticuloManufacturado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_productoManufacturado")
    private ProductoManufacturado productoManufacturado;

    private Date fecha;

    private double precioCosto;

    private double precioVenta;
}
