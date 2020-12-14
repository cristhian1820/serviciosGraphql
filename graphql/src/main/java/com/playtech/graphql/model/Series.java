package com.playtech.graphql.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "series2")
public class Series implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "estaciones")
    private String estaciones;

    public Series() {
    }

    public Series(String nombre, String estaciones) {
        this.nombre = nombre;
        this.estaciones = estaciones;
    }

}

