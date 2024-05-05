package com.example.blibliotecaSp.controller;

import com.example.blibliotecaSp.entity.Categoria;
import com.example.blibliotecaSp.repository.CategoriaRepository;
import com.example.blibliotecaSp.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/")
    public List<Categoria> getCategorias(){
        return categoriaService.getCategorias();
    }

    @GetMapping("/{id}")
    public Categoria getById(@PathVariable("id") long id){
        return categoriaService.getById(id);
    }

    @PostMapping("/")
    public void saveOrUpdate(@RequestBody Categoria categoria){
        categoriaService.saveOrUpdate(categoria);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") long id){
        categoriaService.deleteById(id);
    }
}
