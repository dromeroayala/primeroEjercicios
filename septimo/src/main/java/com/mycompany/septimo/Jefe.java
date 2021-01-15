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
public class Jefe extends Empleado{
    private String departamento;
    private int subordinados;

    public Jefe(String departamento, int subordinados, String nss, int numEmpleados, Date fechaContratacion, float irpf, String cargo, float sueldo, String nombre, String direccion, char sexo, String nif, Date fechaNac) {
        super(nss, numEmpleados, fechaContratacion, irpf, cargo, sueldo, nombre, direccion, sexo, nif, fechaNac);
        this.departamento = departamento;
        this.subordinados = subordinados;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(int subordinados) {
        this.subordinados = subordinados;
    }
    
    
    public void subirSueldo(Empleado empleado, float incremento ){
       sueldo= empleado.getSueldo();
       sueldo+=incremento;
       empleado.setSueldo(sueldo);
    }
    
    
}
