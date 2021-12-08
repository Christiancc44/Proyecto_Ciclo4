package com.hardBody.hardBody.models;

//import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class ClienteModel {
    @Id
    private String id;
    
    private String nombres;
    private String apellidos;
    private String telefono;
    private String estatura;
    private String peso;
    private String direccion;
    private String añoMatricula;

    
    public ClienteModel() {
    }


    public ClienteModel(String id, String nombres, String apellidos, String telefono, String estatura, String peso,
            String direccion, String añoMatricula) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.estatura = estatura;
        this.peso = peso;
        this.direccion = direccion;
        this.añoMatricula = añoMatricula;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getNombres() {
        return nombres;
    }


    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getEstatura() {
        return estatura;
    }


    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }


    public String getPeso() {
        return peso;
    }


    public void setPeso(String peso) {
        this.peso = peso;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getAñoMatricula() {
        return añoMatricula;
    }


    public void setAñoMatricula(String añoMatricula) {
        this.añoMatricula = añoMatricula;
    }




}
