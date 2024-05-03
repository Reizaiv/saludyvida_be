package com.app.saludyvidabackend.service;

import com.app.saludyvidabackend.model.Cita;

import java.util.List;

public interface CitaService {

    //Cita getCita(int id);
    List<Cita> getCitas();
    Cita addCita(Cita cita);
}
