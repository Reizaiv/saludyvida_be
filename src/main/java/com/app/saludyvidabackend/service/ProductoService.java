package com.app.saludyvidabackend.service;

import com.app.saludyvidabackend.model.Producto;

import java.util.List;

public interface ProductoService {

    //Producto findById(int id);
    List<Producto> getAllProductos();
    Producto createProducto(Producto producto);

}
