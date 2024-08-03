/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.Persona;

/**
 *
 * @author Alumno
 */
public class Main1 {
    
    // Método principal, que permitirá la ejecución del programa
    public static void main(String s[]) {
        // creación de la instancia/objeto persona1
        Persona persona1 = new Persona("12345678", "Alejandro", "Navio", "", 20); 
        //persona1.DNI = "12345678";  // asignación de valor al atributo DNI
        //persona1.nombres = "Alejandro"; // acceso a atributo público
        persona1.setNombres("Alejandro");
        persona1.mostrar();
        /*
        System.out.println("El nombre es " + persona1.nombres); // Lectura del atributo
        System.out.println("Email es " + persona1.email);
        System.out.println("Edad es " + persona1.edad);
        System.out.println("DNI es " + persona1.getDNI());
        */
        
        // Crear objeto solo con el DNI
        Persona persona2 = new Persona("10203040");
        // Posteriormente cargar los datos
        persona2.setNombres("Angie");  // asignar el valor al atributo nombres
        persona2.setApellidos("Escudero");
        persona2.setEdad(20);
        persona2.setEmail("aescudero@hotmail.com");
        persona2.mostrar();
    }
}
