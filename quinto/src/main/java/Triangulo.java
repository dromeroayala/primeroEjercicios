/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Triangulo extends Figura implements PoligonoRegular {

    public double calcularArea() {
        double altura = super.getAltura();
        double base = super.getBase();
        double area = (altura * base) / 2;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double x = 0;
        return x;
    }
}
