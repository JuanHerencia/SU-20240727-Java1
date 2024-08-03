package controller;
import model.Boleto;
/**
 *
 * @author Alumno
 */
public class Main {
    public static void main(String[] args) {
        Boleto b1 = new Boleto("Plaza Vea Comas");
        Boleto b2 = new Boleto("Metro UNI");
        Boleto b3 = new Boleto("Mall Iquitos");
        b1.mostrar();
        b2.mostrar();
        b3.mostrar();
    }
}
