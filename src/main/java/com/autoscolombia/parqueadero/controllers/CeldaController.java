package com.autoscolombia.parqueadero.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autoscolombia.parqueadero.models.Usuario;
import com.autoscolombia.parqueadero.services.UsuarioService;

@RestController
@RequestMapping("/api/celdas")
public class CeldaController {

    @Autowired
    private UsuarioService usuarioService;

    // Este es el paso 2 (/api/celdas) y el retorno 7 (200 OK) de tu diagrama
    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario datosUsuario) {
        Usuario nuevoUsuario = usuarioService.registrarUsuario(datosUsuario);
        
        // Retorna HTTP 200 OK con el usuario guardado
        return ResponseEntity.ok(nuevoUsuario);
    }
    
}
