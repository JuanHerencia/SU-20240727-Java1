/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decision; // Indica a que paquete pertenece la clase Decision3
import java.util.Scanner; // Usar una librería externa (llamada Scanner)

/**
 *
 * @author Alumno
 */
public class Decision3 {
        
    public static void main(String[] args) {
        // Definición de constantes (nunca cambia de valor)
        final int LUNES     = 1; // Son solamente de lectura
        final int MARTES    = 2;
        final int MIERCOLES = 3;
        final int JUEVES    = 4;
        final int VIERNES   = 5;
        
        // Se define el objeto sc que proviene de Scanner
        // System.in es la indicación de que se usará el teclado
        // como entrada
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el día en número : ");
        int menu = sc.nextInt(); // menu toma el valor que se ha ingresado
        
        System.out.println("Valor ingresado es " + menu);
        
        switch(menu) {
            case LUNES: 
                System.out.println("Lunes : Lentejas con pollo");
                break; // se termina el bloque de la opción 1
            case MARTES: 
                System.out.println("Martes : Pescado frito");
                break; // se termina el bloque de la opción 2    
            case MIERCOLES: 
                System.out.println("Miercoles : Tallarines con chuleta");
                break; // se termina el bloque de la opción 3
            case JUEVES: 
                System.out.println("Jueves : Ceviche mixto");
                break; // se termina el bloque de la opción 4
            case VIERNES: 
                System.out.println("Viernes : Frejoles con seco");
                break; // se termina el bloque de la opción 5    
            default:  // es opcional
                System.out.println("La opción " + menu + " es incorrecta");
        }
        //LUNES = 10; // No funciona!!!
    }
}
