package com.example.blibliotecaSp.controller;

import com.example.blibliotecaSp.entity.DetallePrestamo;
import com.example.blibliotecaSp.service.DetPrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/Detalles")
public class DetPrestamoController {
    @Autowired
    private DetPrestamoService detPrestamoService;

    @GetMapping("/")
    public List<DetallePrestamo> getDetPrestamos(){
     return detPrestamoService.getDetPrestamos();
    }

    @GetMapping("/{idUser}")
    public List<DetallePrestamo> findByPrestamo(@PathVariable("idUser") long idUsuario){
        return detPrestamoService.findByPrestamo(idUsuario);
    }

    @PostMapping("/")
    public void saveOrUpdate(@RequestBody DetallePrestamo detallePrestamo){
        detPrestamoService.saveOrUpdate(detallePrestamo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        detPrestamoService.delete(id);
    }

    @DeleteMapping("/delete")
    public void eliminarPorIds(List<Long> idsAEliminar) {
        for (Long id : idsAEliminar) {
            detPrestamoService.delete(id);
        }
    }
}
