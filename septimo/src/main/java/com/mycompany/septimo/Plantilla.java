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
public class Plantilla {

    public Plantilla() {
    }
    
    public float totalizarSueldos(Empleado[] empleados){
        float total=0;
        for (Empleado empleado : empleados) {
            if (empleado!=null) {
                total+=empleado.getSueldo();
                
            }
        }
        return total;
    }
    
    public void descontarPorcentaje(Empleado empleado){
       float salario= empleado.getSueldo();
        if (empleado instanceof Jefe) {
           float reducion=salario-(salario*5/100);
           empleado.setSueldo(reducion);
        }else{
            float reducion=salario-(salario*10/100);
            empleado.setSueldo(reducion);
        }
            
        
    }
}
