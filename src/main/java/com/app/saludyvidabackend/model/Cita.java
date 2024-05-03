package com.app.saludyvidabackend.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name="Citas")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_citas;

    @Column(name = "fecha_hora_cita")
    private Timestamp fecha_hora_cita;

    @ManyToOne(optional = false)
    @JoinColumn(name= "id_usuarios")
    private Usuario usuario;

    public Long getId_citas() {
        return id_citas;
    }

    public void setId_citas(Long id_citas) {
        this.id_citas = id_citas;
    }

    public Timestamp getFecha_hora_cita() {
        return fecha_hora_cita;
    }

    public void setFecha_hora_cita(Timestamp fecha_hora_cita) {
        this.fecha_hora_cita = fecha_hora_cita;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cita{");
        sb.append("id_citas=").append(id_citas);
        sb.append(", fecha_hora_cita=").append(fecha_hora_cita);
        sb.append(", usuario=").append(usuario);
        sb.append('}');
        return sb.toString();
    }
}
