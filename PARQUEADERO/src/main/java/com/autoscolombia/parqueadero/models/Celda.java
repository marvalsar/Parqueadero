package com.autoscolombia.parqueadero.models;

import jakarta.persistence.*;

@Entity
@Table(name = "CELDA")
public class Celda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCelda;
    
    private String numeroCelda;
    private String estado;

    // Constructores, Getters y Setters
    public Celda() {}

    public Integer getIdCelda() { return idCelda; }
    public void setIdCelda(Integer idCelda) { this.idCelda = idCelda; }
    public String getNumeroCelda() { return numeroCelda; }
    public void setNumeroCelda(String numeroCelda) { this.numeroCelda = numeroCelda; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
