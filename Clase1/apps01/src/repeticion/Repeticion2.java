/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repeticion;

/**
 *
 * @author Alumno
 */
public class Repeticion2 {
    public static void main(String[] args) {
        /*
           Mostrar los múltiplos de 13 y 19 que existan entre
           2000 y 2500
        */
        for(int conta = 2000; conta <= 2500; conta++) {
            if(conta % 13 == 0 && conta % 19 == 0) {
                System.out.println(conta);
            }
        }
    }
}
