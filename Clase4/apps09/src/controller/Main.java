package controller;

import model.Avion;
import model.Dron;
import model.Pajaro;
import model.IVolador;

/**
 *
 * @author Alumno
 */
public class Main {
    public static void main(String[] args) {
        IVolador[] voladores = {new Avion(), new Pajaro(), new Dron()};
        
        // recorrer los objetos voladores
        for(IVolador volador: voladores) {
            volador.volar();  // polimorfismo
            if(volador instanceof Dron) {
                ((Dron)volador).generadorEnergia();
            } else {
                System.out.println("No tiene generador de energia");
            }
        }
    }
}
