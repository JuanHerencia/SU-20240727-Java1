/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public class Dron implements IVolador, IMotor {

    @Override
    public void volar() {
        System.out.println("Vuelo mecanico del Dron");
    }

    @Override
    public void generadorEnergia() {
        System.out.println("Usa energia de baterias");
    }
    
}
