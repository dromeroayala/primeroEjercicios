/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sexto;

/**
 *
 * @author usuario
 */
public class ClienteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        try {
           Cliente cliente = new Cliente(, 0, "telefono"); 
        } catch (Exception e) {
            ClienteException ex = new ClienteException();
            System.out.println( ex.getMessage());
        }

    }
    
}
