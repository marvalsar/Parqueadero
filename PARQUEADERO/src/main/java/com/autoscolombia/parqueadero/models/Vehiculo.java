package com.autoscolombia.parqueadero.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VEHICULO")
public class Vehiculo {

    @Id
    private String placa; // La placa es la llave primaria

    private String tipoVehiculo; 
    private String marca;
    private String color;

    // Constructores
    public Vehiculo() {}

    // Getters y Setters
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getTipoVehiculo() { return tipoVehiculo; }
    public void setTipoVehiculo(String tipoVehiculo) { this.tipoVehiculo = tipoVehiculo; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}
