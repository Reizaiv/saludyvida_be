package com.app.saludyvidabackend.service;

import com.app.saludyvidabackend.model.Producto;

import java.util.List;

public interface ProductoService {

    //Producto findById(int id);
    List<Producto> findAll();
    Producto createProducto(Producto producto);

}
