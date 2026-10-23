package com.autoscolombia.parqueadero.repositories;

import com.autoscolombia.parqueadero.models.Celda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface CeldaRepository extends JpaRepository<Celda, Integer> {
    Optional<Celda> findByNumeroCelda(String numeroCelda);
}