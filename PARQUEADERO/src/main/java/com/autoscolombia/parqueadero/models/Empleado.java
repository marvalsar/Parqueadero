package com.autoscolombia.parqueadero.models;

import jakarta.persistence.*;

@Entity
@Table(name = "EMPLEADO")
@PrimaryKeyJoinColumn(name = "idUsuario")
public class Empleado extends Usuario {

    @Column(unique = true, nullable = false)
    private Integer idEmpleado;

    // Constructores, Getters y Setters
    public Empleado() {}

    public Integer getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(Integer idEmpleado) { this.idEmpleado = idEmpleado; }
}
