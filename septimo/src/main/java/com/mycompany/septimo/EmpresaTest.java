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
public class EmpresaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date fechaContratacion=new Date(2021-01-11);
        Date fechaNac=new Date(1990-01-11);
        
        Jefe jefe= new Jefe("informatico", 1, "nss", 2, fechaContratacion, 4, "jefe", 1000, "pepe", "calle leon felipe", 'H', "72483748w", fechaNac);
        Empleado empleado= new Empleado("nss", 2, fechaContratacion, 4,"recambio", 100, "miguel", "calle leon miguel", 'H', "7375839q", fechaNac);
        Empleado personas[]=new Empleado[5];
        personas[0]=jefe;
        personas[1]=empleado;
        
        System.out.println(empleado.getSueldo());
        jefe.subirSueldo(empleado, 30);
        System.out.println(empleado.getSueldo());
        
        Plantilla plantilla=new Plantilla();
        float total=plantilla.totalizarSueldos(personas);
        System.out.println(total);
        plantilla.descontarPorcentaje(empleado);
        System.out.println(empleado.getSueldo());
        
        
        System.out.println(jefe.getSueldo());
        plantilla.descontarPorcentaje(jefe);
        System.out.println(jefe.getSueldo());
    }
    
}
