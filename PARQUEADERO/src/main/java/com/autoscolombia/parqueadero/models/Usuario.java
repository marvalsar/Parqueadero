package com.autoscolombia.parqueadero.models;

import jakarta.persistence.*;

@Entity
@Table(name = "USUARIO")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    
    private String usuario;
    private String contraseña;

    // Constructores, Getters y Setters
    public Usuario() {}
    
    public Integer getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Integer idUsuario) { this.idUsuario = idUsuario; }
    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }
}