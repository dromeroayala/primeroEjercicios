/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Circulo extends Figura implements PoligonoRegular {

    public double calcularArea() {

        double base = super.getBase();
        double area = Math.PI * Math.pow(base, 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double x = 0;
        return x;
    }
}
