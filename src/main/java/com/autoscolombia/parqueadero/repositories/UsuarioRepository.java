package com.autoscolombia.parqueadero.repositories;

import com.autoscolombia.parqueadero.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
    Usuario findByDocumento(String documento);
}