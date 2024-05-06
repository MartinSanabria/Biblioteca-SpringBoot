package com.example.blibliotecaSp.controller;

import com.example.blibliotecaSp.entity.Libro;
import com.example.blibliotecaSp.repository.LibroRepository;
import com.example.blibliotecaSp.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/Libros")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping("/")
    public List<Libro> getLibros(){
        return libroService.getLibros();
    }

    @GetMapping("/{id}")
    public Libro getById(@PathVariable("id")long id){
        return libroService.getById(id);
    }

    @PostMapping("/")
    public void saveOrUpdate(@RequestBody Libro libro){
        libroService.saveOrUpdate(libro);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") long id){
        libroService.deleteById(id);
    }

    @GetMapping("/categorias")
    public List<Libro> findByCategoria(@RequestParam("nombre") String nombre) {
        return libroService.findByCategoria(nombre);
    }

    @DeleteMapping("/activate/{id}")
    public void activateBook(@PathVariable("id") long id) {
        libroService.activateBook(id);
    }

    @DeleteMapping("/deactivate/{id}")
    public void deactivateBook(@PathVariable("id") long id) {
        libroService.deactivateBook(id);
    }

}
