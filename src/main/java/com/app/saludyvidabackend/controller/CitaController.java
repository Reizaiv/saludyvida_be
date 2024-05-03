package com.app.saludyvidabackend.controller;

import com.app.saludyvidabackend.model.Cita;
import com.app.saludyvidabackend.model.Producto;
import com.app.saludyvidabackend.model.Usuario;
import com.app.saludyvidabackend.repository.CitaRepository;
import com.app.saludyvidabackend.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/citas")
public class CitaController {

    @Autowired
    CitaService citaService;

    @PostMapping()
    ResponseEntity<Cita> createCitas(@RequestBody Cita cita ){
        Cita createdCita = citaService.createCita(cita);

        return new ResponseEntity<Cita>( createdCita, HttpStatus.CREATED );
    }

    @GetMapping() // localhost:8080/api/v1/users/{id}
    List<Cita> getCitas(){
        List<Cita> citas = citaService.getCitas();
        return citas;
    }

}
