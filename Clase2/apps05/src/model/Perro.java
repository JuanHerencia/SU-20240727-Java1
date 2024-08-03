package model;

/**
 *
 * @author Alumno
 */
public class Perro extends Animal { // La clase Perro es hijo de Animal
    private String nombrePropio;
    
    public Perro(String nombrePropio, String nombre) {
        super(nombre);
        this.nombrePropio = nombrePropio;
        this.setSonido(nombrePropio + " ladra");
    }
}
