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
public class Raton extends DispositivoEntrada {

    private int idRaton;
    private int contadorRatones;

    public Raton(int idRaton, int contadorRatones, String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = idRaton;
        this.contadorRatones = contadorRatones;
    }

    @Override
    public String toString() {
        return super.toString() + " Raton" + "idRaton= " + idRaton + ", contadorRatones= " + contadorRatones;
    }

}
