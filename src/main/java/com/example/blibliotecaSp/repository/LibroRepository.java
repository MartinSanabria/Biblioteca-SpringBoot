package com.example.blibliotecaSp.repository;

import com.example.blibliotecaSp.entity.Categoria;
import com.example.blibliotecaSp.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
    @Query("SELECT t FROM Libro t WHERE t.categoria.nombre LIKE :nombre")
    List<Libro> findByCategoria(String nombre);
}
