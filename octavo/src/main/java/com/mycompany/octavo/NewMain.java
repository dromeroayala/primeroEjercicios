/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.octavo;



/**
 *
 * @author usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item item1= new Item(1, "primer item", 0.50);
        Item item2= new Item(2, "segundo item", 1.00);
        
        CarroCompra lista = new CarroCompra(1);
        lista.incluirProducto(item1);
        lista.incluirProducto(item2);
        System.out.println("precio total = "+lista.getTotalCarro()+"€");
        System.out.println("cantidad total de productos = "+lista.getCantidadProductos());
        lista.guardar();
        lista.cargar();
        System.out.println("cantidad total de productos = "+lista.getCantidadProductos());
        
        
    }
    
}
