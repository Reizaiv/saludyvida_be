package com.app.saludyvidabackend.model;

import jakarta.persistence.*;


@Entity
@Table(name="productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_lentes;

    @Column(name = "nombre_lentes")
    private String nombre_lentes;

    @Column(name = "url_imagen")
    private String url_imagen;

    @Column(name = "marca")
    private String marca;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "modelo_producto")
    private String modelo_producto;

    @Column(name = "sku")
    private String sku;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "genero")
    private String genero;

    @Column(name = "cantidad")
    private Double cantidad;

    public Producto() {

    }

    public Long getId_lentes() {
        return id_lentes;
    }

    public void setId_lentes(Long id_lentes) {
        this.id_lentes = id_lentes;
    }

    public String getNombre_lentes() {
        return nombre_lentes;
    }

    public void setNombre_lentes(String nombre_lentes) {
        this.nombre_lentes = nombre_lentes;
    }

    public String getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl_imagen(String url_imagen) {
        this.url_imagen = url_imagen;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getModelo_producto() {
        return modelo_producto;
    }

    public void setModelo_producto(String modelo_producto) {
        this.modelo_producto = modelo_producto;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Producto{");
        sb.append("id_lentes=").append(id_lentes);
        sb.append(", nombre_lentes='").append(nombre_lentes).append('\'');
        sb.append(", url_imagen='").append(url_imagen).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", modelo_producto='").append(modelo_producto).append('\'');
        sb.append(", sku='").append(sku).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", genero='").append(genero).append('\'');
        sb.append(", cantidad=").append(cantidad);
        sb.append('}');
        return sb.toString();
    }
}

