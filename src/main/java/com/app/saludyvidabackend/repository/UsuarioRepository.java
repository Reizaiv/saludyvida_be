package com.app.saludyvidabackend.repository;

import com.app.saludyvidabackend.model.Producto;
import com.app.saludyvidabackend.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
