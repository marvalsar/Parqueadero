package com.autoscolombia.parqueadero.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autoscolombia.parqueadero.models.Celda;

@Repository
public interface CeldaRepository extends JpaRepository<Celda, Integer> {
    Optional<Celda> findByCodigo(String codigo);
}