package com.app.saludyvidabackend.controller;

import com.app.saludyvidabackend.model.Usuario;
import com.app.saludyvidabackend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    ResponseEntity<Usuario> createUser(@RequestBody Usuario usuario ){
        Usuario createdUser = usuarioService.createUsuario(usuario);

        return new ResponseEntity<Usuario>( createdUser, HttpStatus.CREATED );
    }

    @GetMapping("{id}") // localhost:8080/api/v1/users/{id}
    ResponseEntity<Usuario> getUserById(@PathVariable("id") Long id ){
        return new ResponseEntity<Usuario>(usuarioService.getUsuarioById(id) ,HttpStatus.OK );
    }
}
