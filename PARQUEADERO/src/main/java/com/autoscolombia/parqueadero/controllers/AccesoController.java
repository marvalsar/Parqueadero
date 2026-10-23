package com.autoscolombia.parqueadero.controllers;

import com.autoscolombia.parqueadero.models.RegistroAcceso;
import com.autoscolombia.parqueadero.services.AccesoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accesos")
public class AccesoController {

    @Autowired
    private AccesoService accesoService;

    @PostMapping("/entrada")
    public ResponseEntity<RegistroAcceso> registrarEntrada(@RequestBody RegistroAcceso registro) {
        RegistroAcceso nuevoAcceso = accesoService.registrarEntrada(registro);
        return ResponseEntity.ok(nuevoAcceso);
    }

    @PutMapping("/salida/{id}")
    public ResponseEntity<RegistroAcceso> registrarSalida(@PathVariable Integer id) {
        RegistroAcceso accesoFinalizado = accesoService.registrarSalida(id);
        return ResponseEntity.ok(accesoFinalizado);
    }
}