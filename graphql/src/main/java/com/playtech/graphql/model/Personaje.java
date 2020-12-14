package com.playtech.graphql.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Data
public class Personaje implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apodo", nullable = false)
    private String apodo;

    @Column(name = "ocupacion", nullable = false)
    private String ocupacion;

    @Column(name = "fecha_nacimiento")
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "id_serie", nullable = false, updatable = false)
    private Series series;

    public Personaje () {
    }

    public Personaje(String nombre,
                     String apodo,
                     String ocupacion,
                     Date fecha){
        this.nombre = nombre;
        this.apodo = apodo;
        this.ocupacion = ocupacion;
        this.fecha = fecha;

    }

}
