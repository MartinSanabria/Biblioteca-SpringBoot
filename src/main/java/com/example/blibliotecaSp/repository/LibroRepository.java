package com.example.blibliotecaSp.repository;

import com.example.blibliotecaSp.entity.Libro;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

    @Query("SELECT t FROM Libro t WHERE t.categoria.nombre LIKE :nombre")
    List<Libro> findByCategoria(String nombre);

    @Transactional
    @Modifying
    @Query("UPDATE Libro l SET l.estado = 1 WHERE l.idLibro = :idLibro")
    void activateBook(long idLibro);

    @Transactional
    @Modifying
    @Query("UPDATE Libro l SET l.estado = 0 WHERE l.idLibro = :idLibro")
    void deactivateBook(long idLibro);



}
