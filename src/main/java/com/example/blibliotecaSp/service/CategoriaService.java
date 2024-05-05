package com.example.blibliotecaSp.service;

import com.example.blibliotecaSp.entity.Categoria;
import com.example.blibliotecaSp.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;

    public List<Categoria> getCategorias() {
        return categoriaRepository.findAll();
    }

    public Categoria getById(long id){
        return categoriaRepository.findById(id).orElse(null);
    }

    public void saveOrUpdate(Categoria categoria){
        categoriaRepository.save(categoria);
    }

    public void deleteById(long id){
        categoriaRepository.deleteById(id);
    }
}
