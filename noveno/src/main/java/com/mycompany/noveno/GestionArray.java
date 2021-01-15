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
public class GestionArray {
    int numeros[]= new int[10];
    
    
    public void introducir(){
//        if (vacio()!=true) {
            
        
    Scanner leer=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("introduzca el numero "+(i+1));
            int numero=0;
           numero= leer.nextInt();
           numeros[i]=numero;
           leer.nextLine();
        }
//        }else{
//            System.out.println("Ya ha introduccido los numeros");
//        }
    }
    public void mostrar(){
//        if (vacio()) {
            
        
        for (int numero : numeros) {
            System.out.println(numero);
        }
//        }else{
//            System.out.println("Debe introduccir numeros antes");
//        }
    }
    public void obtenerMayor(){
    int num=-1000;
//    if (vacio()) {
        for (int numero : numeros) {
            if (num<numero) {
                num=numero;
            }
 
        }
        System.out.println("El Mayor numero es "+num);
//    }else{
//        System.out.println("No ha introduccido los numeros");
//        }
    }
    public void obtenerMenor(){
//    if (vacio()) {
    int num=1000000;
        for (int numero : numeros) {
            if (num>numero) {
                num=numero;
            }
 
        }
        System.out.println("El Menor numero es "+num);
//    }else{
//        System.out.println("No ha introducido los numeros");
//        }
    }
    public void obtenerSuma(){
//    if (vacio()) {
    int num=0;
        for (int numero : numeros) {
            num+=numero;
           
            
 
        }
    System.out.println("La suma es de "+num);
//    }else{
//        System.out.println("No ha introducido los numeros");
//    }
    }
    
    public void obtenerMedia(){
//    if (vacio()) {
    double num=0;
        for (int numero : numeros) {
            num+=numero;
 
        }
            num=num/10;
            System.out.println("La media es "+num);
//    }else{
//        System.out.println("No ha introducido los numeros");
//        }
    }
    
//    public boolean vacio(){
//        boolean vacio =true;
//        
//            
//        
//        if (numeros == null) {
//            vacio=true;
//        }else{vacio=false;}
//        return vacio;
//    }
    
}
