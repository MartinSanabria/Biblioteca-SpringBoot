package com.example.blibliotecaSp.repository;

import com.example.blibliotecaSp.entity.DetallePrestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetPrestamoRepository extends JpaRepository<DetallePrestamo, Long> {

    @Query("SELECT T FROM DetallePrestamo T WHERE T.prestamo.usuario.idUsuario = :idUsuario")
    List<DetallePrestamo> findByPrestamo(long idUsuario);



}

