package com.example.blibliotecaSp.repository;

import com.example.blibliotecaSp.entity.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {

    @Query("SELECT T FROM Prestamo T WHERE T.usuario.idUsuario = :idUsuario")
    public List<Prestamo> findByUser (long idUsuario);
}
