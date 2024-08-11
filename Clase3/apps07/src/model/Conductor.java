/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public class Conductor extends Persona {
    private String nro_licencia;
    private String categoria;
    private String fec_emision;
    private boolean estado_vigente;

    public Conductor(Persona persona, String categoria, String fec_emision, String estado_vigente) {
        super(persona.getDNI(), persona.getNombres());
        this.categoria = categoria;
        this.fec_emision = fec_emision;
        if(estado_vigente.equals("Si")) { // si( estado_vigente == "Si")
            this.estado_vigente = true;
        } else {
            this.estado_vigente = false;
        }
        this.nro_licencia = "Q" + persona.getDNI();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFec_emision() {
        return fec_emision;
    }

    public void setFec_emision(String fec_emision) {
        this.fec_emision = fec_emision;
    }

    // getter de estado_vigente
    public boolean getEsVigente() {
        return estado_vigente;
    }

    // setter de estado_vigente
    public void setEsVigente(String estado_vigente) { // se ingresa "Si" o "No"
        this.estado_vigente = estado_vigente.equals("Si");
    }
    
    public void mostrar() {
        super.mostrar(); // muestra datos de persona
        System.out.println("Categoria        : " + categoria);
        System.out.println("Fecha de emision : " + fec_emision);
        if(this.estado_vigente == true) {
            System.out.println("Estado vigente   : Si");
        } else {
            System.out.println("Estado vigente   : No");
        }
    }
    
    public String getNroLicencia() {
        return nro_licencia;
    }

}
