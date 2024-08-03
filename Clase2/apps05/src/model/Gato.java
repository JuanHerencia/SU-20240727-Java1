package model;

/**
 *
 * @author Alumno
 */
public class Gato extends Animal{
    private String nombrePropio;
    
    public Gato(String nombrePropio, String nombre) {
        super(nombre);
        this.nombrePropio = nombrePropio;
        this.setSonido(nombrePropio + " maulla");
    }
}
