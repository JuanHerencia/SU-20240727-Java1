/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repeticion;

/**
 *
 * @author Alumno
 */
public class Repeticion6 {
    public static void main(String[] args) {
        /*
           En un conteo del 1 al 10, no mostrar el 7
        */
        for(int i = 1; i <= 10; i++) {
            if(i == 7)
                continue;  // se corta el bloque de esta ejecución
                           // y se regresa al inicio de la iteracion 
            System.out.println(i);
            System.out.println("Hola");
        }
    }
}
