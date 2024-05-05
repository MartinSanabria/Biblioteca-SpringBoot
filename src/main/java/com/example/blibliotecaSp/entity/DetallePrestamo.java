package com.example.blibliotecaSp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
@Table(name = "DetallePrestamo")
public class DetallePrestamo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDetPrestamo")
    private long idDetPrestamo;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "estado")
    private Character estado;

    @ManyToOne
    @JoinColumn(name = "idLibro", referencedColumnName = "idLibro")
    private Libro libro;

    @ManyToOne
    @JoinColumn(name = "idPrestamo", referencedColumnName = "idPrestamo")
    private Prestamo prestamo;
}
