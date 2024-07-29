/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repeticion;

/**
 *
 * @author Alumno
 */
public class Repeticion3 {
    public static void main(String[] args) {
        /*
            Encontrar los primeros 20 números multiplos de 7
            mayores a 100
        */
        int cuenta_nro = 0;
        for(int conta1 = 100; conta1 < 10000; conta1++) {
            if(conta1 % 7 == 0) {
                System.out.println(conta1);
                cuenta_nro++;
            }
            if(cuenta_nro == 20) { // despues de encontra el 20vo numero
                break;  // se interrumpe el bucle inmediatamente 
            }
        }
    }
}
