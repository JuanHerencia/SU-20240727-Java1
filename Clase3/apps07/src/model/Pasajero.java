package model;

/**
 *
 * @author Alumno
 */
public class Pasajero extends Persona {
    private String fec_registro;
    private boolean estado_vigente;

    public Pasajero(Persona persona, String fec_registro, String estado_vigente) {
        super(persona.getDNI(), persona.getNombres());
        this.fec_registro = fec_registro;
        this.estado_vigente = estado_vigente.equals("Si");
    }

    public String getFec_registro() {
        return fec_registro;
    }

    public void setFec_registro(String fec_registro) {
        this.fec_registro = fec_registro;
    }

    public boolean isEstado_vigente() {
        return estado_vigente;
    }

    public void setEstado_vigente(boolean estado_vigente) {
        this.estado_vigente = estado_vigente;
    }

    @Override
    public String toString() {
        super.mostrar();
        return "Fecha de registro : " + fec_registro + "\n" +
               "Estado vigente    : " + estado_vigente + "\n";
    }
    
    
    
    
}
