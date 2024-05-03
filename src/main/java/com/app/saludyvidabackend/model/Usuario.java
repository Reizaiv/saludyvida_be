package com.app.saludyvidabackend.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuarios;

    @Column(name = "id_tipo")
    private Long id_tipo;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "fecha_nacimiento")
    private Timestamp fecha_nacimiento;

    @Column(name = "genero")
    private String genero;

    @Column(name = "correo")
    private String correo;

    @Column(name = "password")
    private String password;

    @Column(name = "fecha_registro")
    private Timestamp fecha_registro;

    @Column(name = "estatus")
    private String estatus;

    @Column(name = "telefono")
    private String telefono;

    public Long getId_usuarios() {
        return id_usuarios;
    }

    public void setId_usuarios(Long id_usuarios) {
        this.id_usuarios = id_usuarios;
    }

    public Long getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(Long id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Timestamp getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Timestamp fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Timestamp fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Usuario{");
        sb.append("id_usuarios=").append(id_usuarios);
        sb.append(", id_tipo=").append(id_tipo);
        sb.append(", nombres='").append(nombres).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", fecha_nacimiento=").append(fecha_nacimiento);
        sb.append(", genero='").append(genero).append('\'');
        sb.append(", correo='").append(correo).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", fecha_registro=").append(fecha_registro);
        sb.append(", estatus='").append(estatus).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
