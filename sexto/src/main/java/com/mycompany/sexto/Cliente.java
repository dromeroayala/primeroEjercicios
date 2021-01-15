/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sexto;

/**
 *
 * @author usuario
 */
public class Cliente {
    private String nombre;
    private int edad;
    private String telefono;

    public Cliente(String nombre, int edad, String telefono){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception{
        try {
             this.nombre = nombre;
            
        } catch (Exception e) {
            ClienteException ex = new ClienteException();
            System.out.println( ex.getMessage());
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad)throws Exception {
        try {
            this.edad = edad;
            
        } catch (Exception e) {
            ClienteException ex = new ClienteException();
            System.out.println( ex.getMessage());
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono)throws Exception{
        try {
             this.telefono = telefono;
            
        } catch (Exception e) {
            ClienteException ex = new ClienteException();
            System.out.println( ex.getMessage());
        }
    }
    
    
}
