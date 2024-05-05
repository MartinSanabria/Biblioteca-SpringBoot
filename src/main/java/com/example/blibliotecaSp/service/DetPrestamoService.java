package com.example.blibliotecaSp.service;

import com.example.blibliotecaSp.entity.DetallePrestamo;
import com.example.blibliotecaSp.repository.DetPrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetPrestamoService {

    @Autowired
    DetPrestamoRepository detPrestamoRepository;

    public List<DetallePrestamo> getDetPrestamos(){
        return detPrestamoRepository.findAll();
    }

    public List<DetallePrestamo> findByPrestamo(long idUsuario){
        return detPrestamoRepository.findByPrestamo(idUsuario);
    }

    public void saveOrUpdate(DetallePrestamo detallePrestamo){
        detPrestamoRepository.save(detallePrestamo);
    }

    public void delete(long id){
        detPrestamoRepository.deleteById(id);
    }

    public void eliminarPorIds(List<Long> idsAEliminar) {
        for (Long id : idsAEliminar) {
            detPrestamoRepository.deleteById(id);
        }
    }
}
