package com.app.saludyvidabackend.service.impl;

import com.app.saludyvidabackend.model.Cita;
import com.app.saludyvidabackend.repository.CitaRepository;
import com.app.saludyvidabackend.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaServiceImpl implements CitaService {

    @Autowired
    private CitaRepository citaRepository;


    @Override
    public List<Cita> getCitas() {
       return (List<Cita>) citaRepository.findAll();
    }

    @Override
    public Cita createCita(Cita cita) {
        Cita createCita = citaRepository.save(cita);
        return createCita;
    }
}

