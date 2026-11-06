package com.autoscolombia.parqueadero.services;

import com.autoscolombia.parqueadero.models.RegistroAcceso;
import com.autoscolombia.parqueadero.repositories.RegistroAccesoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class AccesoService {

    @Autowired
    private RegistroAccesoRepository registroRepository;

    public RegistroAcceso registrarEntrada(RegistroAcceso nuevoRegistro) {
        nuevoRegistro.setFechaHoraEntrada(LocalDateTime.now());
        nuevoRegistro.setEstadoRegistro("ACTIVO");
        // Aquí se puede agregar lógica para validar si la celda está disponible
        return registroRepository.save(nuevoRegistro);
    }

    public RegistroAcceso registrarSalida(Integer idRegistro) {
        RegistroAcceso registro = registroRepository.findById(idRegistro)
            .orElseThrow(() -> new RuntimeException("Registro no encontrado"));
            
        registro.setFechaHoraSalida(LocalDateTime.now());
        registro.setEstadoRegistro("FINALIZADO");
        // Aquí se puede agregar lógica para liberar la celda
        return registroRepository.save(registro);
    }
}
