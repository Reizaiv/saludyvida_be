package com.app.saludyvidabackend.service.impl;

import com.app.saludyvidabackend.model.Usuario;
import com.app.saludyvidabackend.repository.UsuarioRepository;
import com.app.saludyvidabackend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario getUsuarioById(Long id) {
        Optional<Usuario> usuarioOpc = usuarioRepository.findById(id);
        Usuario existingUser;

        if( usuarioOpc.isPresent() ) {
            existingUser = usuarioOpc.get();
            return existingUser;
        } else {
            throw new IllegalStateException("User does not exist with id " + id);
        }
    }

    @Override
    public <List> Usuario findAll() {
        return null;
    }

    /*
    @Override
    public <List> Usuario findAll() {
        return findAll();
    }*/

    @Override
    public Usuario createUsuario(Usuario usuario) {
        Usuario createUsuario = usuarioRepository.save(usuario);
        return createUsuario;
    }
}
