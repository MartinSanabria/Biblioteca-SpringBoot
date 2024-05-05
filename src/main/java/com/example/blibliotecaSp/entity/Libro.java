package com.example.blibliotecaSp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Data
@Entity
@Table(name = "Libro")
public class Libro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idLibro")
    private Long idLibro;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "autor")
    private String autor;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "foto")
    private String foto;
    @Column(name = "estado")
    private Character estado;

    @ManyToOne
    @JoinColumn(name = "idCategoria", referencedColumnName = "idCategoria")
    private Categoria categoria;
}
