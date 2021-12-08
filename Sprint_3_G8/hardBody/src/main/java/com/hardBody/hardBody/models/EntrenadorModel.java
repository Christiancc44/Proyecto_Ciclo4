package com.hardBody.hardBody.models;

import org.springframework.data.annotation.Id;

public class EntrenadorModel {

    @Id
    private String id;
    private String nombres;
    private String apellidos;
    private String añoNacimiento;
    private String telefono;
    private String direccion;

    public EntrenadorModel() {
    }

    public EntrenadorModel(String id, String nombres, String apellidos, String añoNacimiento, String telefono,
            String direccion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.añoNacimiento = añoNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
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

    public String getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(String añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

    
    

}
