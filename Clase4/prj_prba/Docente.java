
/**
 * Write a description of class Docente here.
 * 
 * @author Juan Herencia
 * @version 13/08/2024
 */
public class Docente extends Persona
{
    private int cod_docente;
    private String especialidad_tecnica;
    
    public Docente(Persona p, int cod_docente, String especialidad_tecnica)
    {
        super(p.getDNI(), p.getNombres(), p.getEmail());
        this.cod_docente = cod_docente;
        this.especialidad_tecnica = especialidad_tecnica;
    }
    
    public void show() {
        System.out.println("-------------- Docente --------------");
        System.out.println("DNI           : " + this.getDNI());
        System.out.println("Nombres       : " + this.getNombres());
        System.out.println("Email         : " + this.getEmail());
        System.out.println("Código docente: " + cod_docente);
        System.out.println("Especialidad  : " + especialidad_tecnica);
    }
}
