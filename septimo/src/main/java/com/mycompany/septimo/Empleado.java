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
public class Empleado extends Persona {

    protected String nss;
    protected int numEmpleados;
    protected Date fechaContratacion;
    protected float irpf;
    protected String cargo;
    protected float sueldo;

    public Empleado(String nss, int numEmpleados, Date fechaContratacion, float irpf, String cargo, float sueldo, String nombre, String direccion, char sexo, String nif, Date fechaNac) {
        super(nombre, direccion, sexo, nif, fechaNac);
        this.nss = nss;
        this.numEmpleados = numEmpleados;
        this.fechaContratacion = fechaContratacion;
        this.irpf = irpf;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

   

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public float getIrpf() {
        return irpf;
    }

    public void setIrpf(float irpf) {
        this.irpf = irpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

}
