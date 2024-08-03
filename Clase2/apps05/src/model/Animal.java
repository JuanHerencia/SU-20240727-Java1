package model;
/**
 * 
 *
 * @author Alumno
 */
public class Animal {
    private String nombre;
    private String tipo;
    private String sonido;
    
    public Animal(String nombre, String sonido, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.sonido = sonido;
    }
    
    public Animal(String nombre) {
        this.nombre = nombre;
        this.tipo = "Sin tipo";
        this.sonido = "Sin sonido";
    }
    
    public void hacerSonido() {
        System.out.println(sonido);
    }
    
    // Será usado solamente por sus descendientes
    protected void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
