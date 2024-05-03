package com.app.saludyvidabackend.model;

import jakarta.persistence.*;

@Entity
@Table(name="compras")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_compra;

    @ManyToOne(optional = false)
    @JoinColumn(name= "id_usuarios")
    private Usuario usuario;

    @ManyToMany
    @JoinColumn(name= "id_producto")
    private Producto producto;


}
