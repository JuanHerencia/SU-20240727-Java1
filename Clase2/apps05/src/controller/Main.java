package controller;
/*
import model.Perro;
import model.Gato;
*/
import model.*;

/**
 *
 * @author Alumno
 */
public class Main {
    public static void main(String[] args) {
        Perro p1 = new Perro("fido", "perro");
        p1.hacerSonido(); // se obtiene la particularidad/especifico/regla de negocio
        Gato g1 = new Gato("Mitsi", "felino"); // regla oculta (maulla)
        g1.hacerSonido();
        PerroVigilante p2 = new PerroVigilante("capitan");
        p2.hacerSonido();
    }
}
