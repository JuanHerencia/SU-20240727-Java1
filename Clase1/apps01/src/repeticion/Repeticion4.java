/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repeticion;

/**
 *
 * @author Alumno
 */
public class Repeticion4 {
    public static void main(String[] args) {
        /*
           Ingresar desde teclado números enteros
           y terminar el programa cuando se ingrese cero.
        */
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int numero;
        
        /*
        // do - while
        do {
            System.out.print("Ingrese numero : ");
            numero = sc.nextInt();
        } 
        while(numero != 0); // repetir mientras el numero sea diferente de cero
        */
        
        System.out.print("Ingrese numero : ");
        numero = sc.nextInt();
        while(numero != 0) {
            System.out.print("Ingrese numero : ");
            numero = sc.nextInt();
        }
    }
}
