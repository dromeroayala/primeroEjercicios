/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class FiguraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo =new Circulo();
        Rectangulo rectangulo =new Rectangulo();
        Triangulo triangulo =new Triangulo();
        
        
        System.out.println("area rectangulo = "+ rectangulo.calcularArea()+" area triangulo = "+ triangulo.calcularArea()+" area circulo = "+ circulo.calcularArea());
    }
    
}
