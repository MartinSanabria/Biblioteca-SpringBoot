package com.example.blibliotecaSp.controller;

import com.example.blibliotecaSp.entity.Prestamo;
import com.example.blibliotecaSp.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/Prestamos")
public class PerstamoController {

    @Autowired
    private PrestamoService prestamoService;
    @GetMapping("/")
    public List<Prestamo> findByUser(@PathVariable("id") long id){
        return  prestamoService.findByUser(id);
    }

    @GetMapping("/{id}")
    public Prestamo getById(@PathVariable("id") long id){
        return  prestamoService.getById(id);
    }

    @PostMapping("/")
    public void saveOrUpdate(@RequestBody Prestamo prestamo){
        prestamoService.saveOrUpdate(prestamo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        prestamoService.delete(id);
    }


}
