/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.septimo;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Persona {
    protected String nombre;
    protected String direccion;
    protected char sexo;
    protected String nif;
    protected Date fechaNac;

    public Persona(String nombre, String direccion, char sexo, String nif, Date fechaNac) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.sexo = sexo;
        this.nif = nif;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
    
    
}
