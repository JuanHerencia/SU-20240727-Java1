/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public class Empleado {
    // Atributos
    private int cod_empleado;
    private Persona persona;
    private int sueldo;
    private String cargo;
    private String fec_ingreso;
    
    // Constructor
    public Empleado(int cod_empleado, Persona persona, int sueldo, 
            String cargo, String fec_ingreso) {
        this.cod_empleado = cod_empleado;
        this.persona = persona;
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.fec_ingreso = fec_ingreso;
    }
    
    //getters y setters

    public int getCod_empleado() {
        return cod_empleado;
    }

    // Observar que cualquier atributo no es modificable
    public void setCod_empleado(int cod_empleado) {
        this.cod_empleado = cod_empleado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFec_ingreso() {
        return fec_ingreso;
    }

    public void setFec_ingreso(String fec_ingreso) {
        this.fec_ingreso = fec_ingreso;
    }
    
    // Mostrar datos del empleado
    public void mostrar() {
        System.out.println("---------Empleado-------");
        System.out.println("Codigo        : " + this.cod_empleado);
        this.persona.mostrar(); // muestra datos de persona
        System.out.println("Sueldo        : " + this.sueldo);
        System.out.println("Cargo         : " + this.cargo);
        System.out.println("Fecha ingreso : " + this.fec_ingreso);
    }
    
}
