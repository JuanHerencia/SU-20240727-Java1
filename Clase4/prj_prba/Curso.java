
/**
 * Write a description of class Curso here.
 * 
 * @author Juan Herencia
 * @version 13/08/2024
 */
public class Curso
{
    private int cod_curso;
    private String nombre;
    
    public Curso(int cod_curso, String nombre)
    {
        this.cod_curso = cod_curso;
        this.nombre = nombre;
    }
    
    public String getNombre()
    {
        return nombre;
    }
}
