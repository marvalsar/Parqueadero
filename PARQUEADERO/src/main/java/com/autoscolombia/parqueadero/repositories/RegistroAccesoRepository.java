package com.autoscolombia.parqueadero.repositories;

import com.autoscolombia.parqueadero.models.RegistroAcceso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RegistroAccesoRepository extends JpaRepository<RegistroAcceso, Integer> {
    // Método personalizado para buscar vehículos activos en el parqueadero
    List<RegistroAcceso> findByEstadoRegistro(String estadoRegistro);
}
