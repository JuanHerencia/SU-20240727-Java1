/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public class Calculadora {
    double a, b;
    
    // Con argumentos
    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    // Sin argumentos
    public Calculadora() {
        this.a = 0;
        this.b = 0;
    }
    
    public double suma(double a, double b) {
        return a + b;
    }
    
    // sobre carga de métodos
    public double suma() {
        return this.a + this.b;
    }
    
    public double resta(double a, double b) {
        return a - b;
    }
    
    public double resta() {
        return this.a - this.b;
    }
    
    public double multiplicacion(double a, double b) {
        return a * b;
    }
    
    public double multiplicacion() {
        return this.a * this.b;
    }
    
    public double division(double a, double b) {
        if(b == 0) {
            System.out.println("No se puede dividir por cero!!!");
            return 0;
        }
        return a / b;
    }
    
    public double division() {
        if(b == 0) {
            System.out.println("No se puede dividir por cero!!!");
            return 0;
        }
        return a / b;
    }
}
