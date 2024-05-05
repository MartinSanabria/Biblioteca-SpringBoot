package com.example.blibliotecaSp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
@Table(name = "Categoria")
public class Categoria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategoria")
    private long idCategoria;
    @Column(name = "nombre",unique = true,nullable = false)
    private String nombre;
    @Column(name = "estado")
    private Character estado;
    @Column(name = "edicion")
    private String edicion;
}
