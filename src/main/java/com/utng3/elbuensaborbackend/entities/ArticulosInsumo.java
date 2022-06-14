package com.utng3.elbuensaborbackend.entities;


import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "ArticulosInsumo")
public class ArticulosInsumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denominacion;
    private String descripcion;
    private int stock;
    private int stockMinimo;
    private int stockMaximo;
    private String unidadMedida;
    private boolean esApilable;
    private boolean requiereRefrigeracion;
    private String marca;
    private Date fechaVencimiento;
    @OneToOne
    @JoinColumn(name = "fk_rubroArticulo")
    private RubroArticulo rubroArticulo;

}
