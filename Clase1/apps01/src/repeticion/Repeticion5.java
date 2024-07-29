/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repeticion;

/**
 *
 * @author Alumno
 */
public class Repeticion5 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int numero;
        
        while(true)  {  // repeticion infinita // for(;;)
            System.out.print("Ingrese numero : ");
            numero = sc.nextInt();
            if(numero == 0) {
                break; // se termina la repetición
            }
        }
    }
}
