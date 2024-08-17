
/**
 * Write a description of class Persona here.
 * 
 * @author Juan Herencia 
 * @version 12/08/2024
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String DNI;
    private String nombres;
    private String email;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String DNI, String nombres, String email)
    {
        // initialise instance variables
        this.DNI = DNI;
        this.nombres = nombres;
        this.email = email;        
    }

    public Persona()
    {
        this("","","");
    }
    
    public String getDNI() {
        return DNI;
    }
    
    public String getNombres() {
        return nombres;
    }
    
    public String getEmail() {
        return email;
    }
}
