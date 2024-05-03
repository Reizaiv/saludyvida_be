package com.app.saludyvidabackend.controller;


import com.app.saludyvidabackend.model.Producto;
import com.app.saludyvidabackend.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("createProducto")
    Producto setProduct(@RequestBody Producto producto) {
        Producto nuevoProducto = productoService.createProducto(producto);
        return nuevoProducto;
    }


    @GetMapping("getProductos")
    List<Producto> getProducts(){

        List<Producto> products = productoService.getAllProductos();
        return products;

    }


}
