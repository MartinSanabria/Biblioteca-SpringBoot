package com.example.blibliotecaSp.service;

import com.example.blibliotecaSp.entity.Libro;
import com.example.blibliotecaSp.entity.Usuario;
import com.example.blibliotecaSp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> getUsuarios(){
        return usuarioRepository.findAll();
    }

    public Usuario getUserById(long id){
        return usuarioRepository.findById(id).orElse(null);
    }

    public void saveOrUpdate(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public void delete(long id){
        usuarioRepository.deleteById(id);
    }

    public Usuario findByUsername(String username) {
        return usuarioRepository.findByUsername(username);
    }
}
