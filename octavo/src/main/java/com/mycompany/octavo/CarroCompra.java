/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.octavo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public final class CarroCompra implements Serializable {

    private int idcarro;
    private ArrayList<Item> productos = new ArrayList<>();
    private double totalCarro;

    public CarroCompra(int idcarro) {
        this.idcarro = idcarro;
        this.totalCarro = sumacarro();
    }

    public int getIdcarro() {
        return idcarro;
    }

    public void setIdcarro(int idcarro) {
        this.idcarro = idcarro;
    }

    public ArrayList<Item> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Item> productos) {
        this.productos = productos;
    }

    public double getTotalCarro() {
        return totalCarro;
    }

    public void incluirProducto(Item item) {
        productos.add(item);
        totalCarro = sumacarro();
    }

    public void setTotalCarro(double totalCarro) {
        this.totalCarro = totalCarro;
    }

    public double sumacarro() {
        double total = 0;
        for (Item producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public int getCantidadProductos() {
        int cantidadProductos = 0;
        for (Item producto : productos) {
            cantidadProductos++;

        }
        return cantidadProductos;
    }

    public void guardar() {
        FileWriter fichero = null;
        try {

            fichero = new FileWriter("listaCompra.txt");

            // Escribimos linea a linea en el fichero
            for (Item producto : productos) {
                System.out.println(producto);
                fichero.write(producto + "\n");
            }

            fichero.close();

        } catch (IOException ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }

    public void cargar() {
        // Fichero del que queremos leer
        File fichero = new File("listaCompra.txt");
        Scanner s = null;

        try {
            // Leemos el contenido del fichero
            System.out.println("... Leemos el contenido del fichero ...");
            s = new Scanner(fichero);
            System.out.println(s);
            // Leemos linea a linea el fichero
            while (s.hasNextLine()) {
                String linea = s.nextLine();
                String[] lineas = new String[3];
                lineas = linea.split(",");
                int id = Integer.decode(lineas[0]);
                String descripcion = lineas[1];
                double precio = Double.parseDouble(lineas[2]);
                Item item = new Item(id, descripcion, precio);
                incluirProducto(item);

            }

        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
    }

}
