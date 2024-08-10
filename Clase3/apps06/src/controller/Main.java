package controller;
import model.Calculadora;

/**
 *
 * @author Alumno
 */
public class Main {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        System.out.println("Suma :"+ cal.suma(45, 3.65));
        System.out.println("Multiplicacion :"+ cal.multiplicacion(2, 6));
        System.out.println("División :"+ cal.division(15, 0));
        
        double x = 12.5, y = 4;
        Calculadora cal2 = new Calculadora(x, y);
        
        System.out.println("Suma :"+ cal2.suma());
        System.out.println("Multiplicacion :"+ cal2.multiplicacion());
        System.out.println("División :"+ cal2.division());
    }
}
