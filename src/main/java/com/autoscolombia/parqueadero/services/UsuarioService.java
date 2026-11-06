package com.autoscolombia.parqueadero.services;

import com.autoscolombia.parqueadero.models.Usuario;
import com.autoscolombia.parqueadero.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario registrarUsuario(Usuario datosUsuario) {
        // Al crear un usuario nuevo, siempre entra como "Activo" por defecto
        datosUsuario.setEstado("Activo");
        
        // El repositorio ejecuta el save(usuario) en MySQL
        return usuarioRepository.save(datosUsuario); 
    }
}