package com.example.blibliotecaSp.service;

import com.example.blibliotecaSp.entity.Prestamo;
import com.example.blibliotecaSp.repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoService {
    @Autowired
    PrestamoRepository prestamoRepository;

    public List<Prestamo> findByUser(long id){
        return prestamoRepository.findByUser(id);
    }

    public Prestamo getById(Long id){
        return  prestamoRepository.findById(id).orElse(null);
    }

    public void saveOrUpdate(Prestamo prestamo){
        prestamoRepository.save(prestamo);
    }

    public void delete(long id){
        prestamoRepository.deleteById(id);
    }

}

