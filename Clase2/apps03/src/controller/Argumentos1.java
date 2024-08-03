/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Alumno
 */
public class Argumentos1 {
    public static void suma_numeros(int... numeros) {
        int sum = 0; // se ha creado dentro de suma_numeros
        for(int numero:numeros) {
            sum += numero;
        }
        System.out.println("La suma es " + sum);
    }
    
    public static void main(String[] args) {
        // mostrar los argumentos ingresados
        for(int i = 0; i < args.length; i++) {
            System.out.println("Arg " + i + " es " + args[i]);
        }
        
        suma_numeros(3, 9, 7, 1, 13, 11); // muestra la suma de los numeros
        //System.out.println(sum); // se invoca a una variable creada en main
    }
}
