package com.example.blibliotecaSp.service;

import com.example.blibliotecaSp.entity.Categoria;
import com.example.blibliotecaSp.entity.Libro;
import com.example.blibliotecaSp.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    LibroRepository libroRepository;

    public List<Libro> getLibros() {
        return libroRepository.findAll();
    }

    public Libro getById(long id){
        return libroRepository.findById(id).orElse(null);
    }

    public void saveOrUpdate(Libro libro){
        libroRepository.save(libro);
    }

    public void deleteById(long id){
        libroRepository.deleteById(id);
    }

    public List<Libro> findByCategoria(String nombreEstado) {
        return libroRepository.findByCategoria(nombreEstado);
    }
}

