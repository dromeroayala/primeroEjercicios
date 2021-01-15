/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mundopc;

import com.sun.corba.se.impl.orbutil.closure.Constant;

/**
 *
 * @author usuario
 */
public class Orden {

    private int idorden;
    private Computadora computadoras[];
    private int contadorOrdenes = 0;
    private int contadorComputadoras = 0;
    private int maxComputadoras = 10;

    public Orden() {

        computadoras = new Computadora[maxComputadoras];
        contadorOrdenes++;
    }

    public void agregarComputadora(Computadora computadora) {
        for (int i = 0; i < maxComputadoras; i++) {
            if (computadoras[i] == null) {
                computadoras[i] = computadora;
            }
        }
        contadorComputadoras++;

    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < maxComputadoras; i++) {
            if (!(computadoras[i] == null)) {
                total++;
            }
        }
        return total;
    }

    public void mostrarOrden() {
        String informacionComputadora = " ";
        for (int i = 0; i < maxComputadoras; i++) {

            informacionComputadora += +(i + 1) + computadoras[i].toString() + " ";
        }
        System.out.println(informacionComputadora);
    }

}
