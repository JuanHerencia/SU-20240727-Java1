package model;

/**
 *
 * @author Juan Herencia
 * @version 1.0
 * @fecha   03/08/2024
 * 
 * Esta clase gestiona información de personas
 * 
 */
public class Persona {
    // Atributos o características
    // cuando no se indican los accesos, por defecto son privados
    private   String DNI;
    public    String nombres;
    protected String apellidos;
    public    String email;
    public    int    edad;
    
    // Constructor o inicializador para un objeto
    public Persona(String DNI, String nombres, 
            String apellidos, String email, int edad) {
        this.DNI = DNI;  // Se inicializa el DNI
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.edad = edad;
    }
    
    // Otro constructor
    public Persona(String DNI) {
        this.DNI = DNI;  // Se inicializa el DNI
        this.nombres = "SIN DATO";
        this.apellidos = "SIN DATO";
        this.email = "SIN DATO";
        this.edad = 0;
    }
    
    
    // getXXXXXX es un método para obtener un valor de un atributo
    // Método que devuelve el valor del DNI
    public String getDNI() {
        return this.DNI;
    }
    
    public void mostrar() {
        System.out.println("El nombre es " + this.nombres); // Lectura del atributo
        System.out.println("Email es " + this.email);
        System.out.println("Edad es " + this.edad);
        System.out.println("DNI es " + this.getDNI());
    }
    
    // setXXXXXX es un método para asignar un valor a un atributo
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    // 
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
