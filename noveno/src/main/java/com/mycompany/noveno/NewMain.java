/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.noveno;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salir= true;
        GestionArray array=new GestionArray();
        Scanner leer=new Scanner(System.in);
        do{
            System.out.println("INDIQUE UNA OPCION"+"\n"+"1-introduccir numeros"+"\n"+"2-mostrar"+"\n"+"3-obtener el mayor numero"+"\n"+"4-obtener el menor numero"+"\n"+"5-obtener la suma total"+"\n"+"6-obtener la media"+"\n"+"7-salir");
            int opcion= leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Introduzca numero y derle a enter le solicitara 10 numeros");
                    array.introducir();
                    break;
                case 2:
                    System.out.println("Los numeros guardados son los siguientes:");
                    array.mostrar();
                    break;
                case 3:
                    System.out.println("Acontinuación le indicamos el numero mayor de los que ha introduccido");
                    array.obtenerMayor();
                    break;
                case 4:
                    System.out.println("Acontinuación le indicamos el numero menor de los que ha introduccido");
                    array.obtenerMenor();
                    break;
                case 5:
                    array.obtenerSuma();
                    break;
                case 6:
                    array.obtenerMedia();
                    break;
                case 7:
                    salir =false;
                    break;
            }
                
        }while(salir);
    }
    
}
