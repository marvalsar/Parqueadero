package com.autoscolombia.parqueadero.models;

import jakarta.persistence.*;

@Entity
@Table(name = "CELDA")
public class Celda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCelda;
    
    @Column(unique = true)
    private String codigo; // Ej: B07
    private String tipoVehiculo; // Carro, Moto
    private String tipoCelda; // General, Reservada
    private String estado; // Disponible, Ocupada, Fuera de Servicio

    // ==========================================
    // GETTERS Y SETTERS
    // ==========================================
    public Integer getIdCelda() { return idCelda; }
    public void setIdCelda(Integer idCelda) { this.idCelda = idCelda; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getTipoVehiculo() { return tipoVehiculo; }
    public void setTipoVehiculo(String tipoVehiculo) { this.tipoVehiculo = tipoVehiculo; }

    public String getTipoCelda() { return tipoCelda; }
    public void setTipoCelda(String tipoCelda) { this.tipoCelda = tipoCelda; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}