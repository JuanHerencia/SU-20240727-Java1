package model;

/**
 *
 * @author Alumno
 */
public class Persona {
    private String DNI;
    private String nombres;

    public Persona(String DNI, String nombres) {
        this.DNI = DNI;
        this.nombres = nombres;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    public void mostrar()  {
        System.out.println("DNI     : " + DNI);
        System.out.println("Nombres : " + nombres);
    }
}
