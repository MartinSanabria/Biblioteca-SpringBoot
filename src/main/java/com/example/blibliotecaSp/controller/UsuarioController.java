package com.example.blibliotecaSp.controller;

import com.example.blibliotecaSp.entity.Usuario;
import com.example.blibliotecaSp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/Usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public List<Usuario> getUsuarios(){
        return usuarioService.getUsuarios();
    }

    @GetMapping("/{id}")
    public Usuario getUserById(@PathVariable("id") long id){
        return usuarioService.getUserById(id);
    }

    @PostMapping("/")
    public void saveOrUpdate(@RequestBody Usuario usuario){
        usuarioService.saveOrUpdate(usuario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        usuarioService.delete(id);
    }

    @GetMapping("/User")
    public Usuario findByUsername(@RequestParam("nombre") String nombre){
      return usuarioService.findByUsername(nombre);
    }
}
