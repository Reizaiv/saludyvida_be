package com.app.saludyvidabackend.repository;

import com.app.saludyvidabackend.model.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto, Long> {
}
