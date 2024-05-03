package com.app.saludyvidabackend.service;

import com.app.saludyvidabackend.model.Usuario;

public interface UsuarioService {

    Usuario getUsuarioById(Long id);

   // Usuario getUsuario(String nombre);

    <List>Usuario findAll();
    Usuario createUsuario(Usuario usuario);
}
