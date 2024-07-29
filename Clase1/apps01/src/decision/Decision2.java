/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decision;

/**
 *
 * @author Alumno
 */
public class Decision2 {
    public static void main(String[] args) {
        // dos decisiones
        // Si calif es mayor o igual a 14 se muestre mensaje
        // CURSO APROBADO, de otra forma CURSO DESAPROBADO
        int calif = 17; // java es sensible a mayúsculas y minúsculas
                        // las minúsculas y mayúsculas no son iguales!!! 
        if (calif >= 14) {
            System.out.println("CURSO APROBADO con " + calif);
        } else {
            System.out.println("CURSO DESAPROBADO con " + calif);
        }
    }
}
