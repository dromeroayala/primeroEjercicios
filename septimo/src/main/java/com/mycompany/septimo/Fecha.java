/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.septimo;

/**
 *
 * @author usuario
 */
public class Fecha {

    private int dia;
    private int mes;
    private int año;
    private int diaSemana;

    public Fecha(int dia, int mes, int año, int diaSemana) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.diaSemana = diaSemana;
    }

    public Fecha() {
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

}
