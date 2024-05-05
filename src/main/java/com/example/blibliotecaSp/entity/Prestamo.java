package com.example.blibliotecaSp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.security.Timestamp;

@Entity
@Data
@Table(name = "Prestamo")
public class Prestamo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPrestamo")
    private long idPrestamo;
    @Column(name = "fecha")
    private Timestamp fecha;
    @Column(name = "estado")
    private Character estado;
    @ManyToOne
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    private Usuario usuario;
}
