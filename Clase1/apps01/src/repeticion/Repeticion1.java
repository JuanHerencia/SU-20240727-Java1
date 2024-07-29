/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repeticion;

/**
 *
 * @author Alumno
 */
public class Repeticion1 {
    // Uso de for
    
    public static void main(String[] args) {
        // mostrar 11 veces el texto "Debo repasar Java en la semana"
        // iteracion con uso de contador
        // un contador esta en un rango de valores enteros o reales
        /* for(inicializacion de contador;
               límite del contador;  // mientras el contador esté dentro del límite
                                     // se mantiene la repetición
               razon aritmetica o geométrica de cambio)
           {
           } */
        /*
          var++   incremento en la unidad
          var--   decremento en la unidad
        
          var += 3  incremento en la unidad
          var *= 2  la variable se duplica
          var /= 3  se divide en 3
        */
        for(int conta = 1; conta <= 11; conta++ ) { // conta = conta + 1
            System.out.println("iteracion " + conta + " Debo repasar Java en la semana");
        }
    }
}
