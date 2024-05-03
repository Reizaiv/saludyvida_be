package com.app.saludyvidabackend.service.impl;

import com.app.saludyvidabackend.model.Producto;
import com.app.saludyvidabackend.repository.ProductoRepository;
import com.app.saludyvidabackend.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> getAllProductos() {
        List<Producto> productos = (List<Producto>) productoRepository.findAll();
        return productos;
    }

    @Override
    public Producto createProducto(Producto producto) {
        Producto nuevoProducto = productoRepository.save(producto);
        return nuevoProducto;
    }
}
