package controller;
import model.Perro;
import model.Gato;
/**
 *
 * @author Alumno
 */
public class Main {
    public static void main(String[] args) {
        Perro p1 = new Perro("fido", "perro");
        p1.hacerSonido();
        Gato g1 = new Gato("Mitsi", "felino");
        g1.hacerSonido();
    }
}
