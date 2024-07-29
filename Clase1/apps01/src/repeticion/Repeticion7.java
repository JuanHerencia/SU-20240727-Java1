/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repeticion;

/**
 *
 * @author Alumno
 */
public class Repeticion7 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int numero;
        int cuenta_impar = 0, cuenta_par = 0;
        int suma_impares = 0;
        do {
            System.out.print("Ingrese numero : ");
            numero = sc.nextInt(); // lee el nro
            if(numero % 2 == 1) // si es impar
            {
                cuenta_impar++;
                suma_impares += numero; // numero se agrega a suma_impares
            } else {
                cuenta_par++;
            }
        } 
        while(numero != 0);
        
        System.out.println("Cantidad de pares   : " + (cuenta_par - 1));
        System.out.println("Cantidad de impares : " + cuenta_impar);
        System.out.println("Suma de impares     : " + suma_impares);
    }
}
