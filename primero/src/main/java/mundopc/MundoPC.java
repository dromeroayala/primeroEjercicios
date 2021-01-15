/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;

import com.mycompany.mundopc.Computadora;
import com.mycompany.mundopc.Monitor;
import com.mycompany.mundopc.Orden;
import com.mycompany.mundopc.Raton;
import com.mycompany.mundopc.Teclado;

/**
 *
 * @author usuario
 */
public class MundoPC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teclado teclado = new Teclado(0, 0, "tipoEntrada", "marca");
        Raton raton = new Raton(0, 0, "tipoEntrada", "marca");
        Monitor monitor = new Monitor();
        Computadora computadora = new Computadora();
        Orden orden = new Orden();
        orden.agregarComputadora(computadora);
        orden.mostrarOrden();
    }

}
