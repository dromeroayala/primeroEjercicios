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
public class Teclado extends DispositivoEntrada {

    private int idTeclado;
    private int contadorTeclados;

    public Teclado(int idTeclado, int contadorTeclados, String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = idTeclado;
        this.contadorTeclados = contadorTeclados;
    }

    @Override
    public String toString() {
        return super.toString() + " Teclado: " + "idTeclado=" + idTeclado + ", contadorTeclados=" + contadorTeclados;
    }

}
