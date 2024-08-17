package controller;

import model.Fecha;

/**
 *
 * @author Alumno
 */
public class Main {
    public static void main(String[] args) {
        Fecha fecDescAmerica = new Fecha(12,10,1492);
        System.out.println("El decubrimiento de america fue hace " + fecDescAmerica.diferenciaFecha(new Fecha(), fecDescAmerica) + " años");
    }
}
