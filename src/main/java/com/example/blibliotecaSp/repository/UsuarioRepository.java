package com.example.blibliotecaSp.repository;

import com.example.blibliotecaSp.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query("SELECT t FROM Usuario t WHERE t.username LIKE :nombre")
    Usuario findByUsername(String nombre);
}
