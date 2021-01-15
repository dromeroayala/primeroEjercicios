/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mundopc;

/**
 *
 * @author usuario
 */
public class Monitor {

    private int idMonitor;
    private String marca;
    private double tamaño;
    private int contadorMonitores;

    public Monitor() {
    }

    public Monitor(String marca, double tamaño) {
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getContadorMonitores() {
        return contadorMonitores;
    }

    public void setContadorMonitores(int contadorMonitores) {
        this.contadorMonitores = contadorMonitores;
    }

    @Override
    public String toString() {
        return "Monitor " + "idMonitor=" + idMonitor + ", marca=" + marca + ", tama\u00f1o=" + tamaño + ", contadorMonitores=" + contadorMonitores;
    }

}
