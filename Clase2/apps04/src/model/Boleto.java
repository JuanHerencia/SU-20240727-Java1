package model;

/**
 *
 * @author Alumno
 */
public class Boleto {
    private int numero;
    private static int ultimo_numero = 0; // la variable será global
    private String vendido_por;
    
    public Boleto(String vendido_por) {
        this.vendido_por = vendido_por;
        ultimo_numero++;
        this.numero = ultimo_numero;
    }
    
    public void mostrar() {
        System.out.println("----- Boleto Nro " + this.numero + "-----");
        System.out.println("Vendido por " + this.vendido_por);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getVendido_por() {
        return vendido_por;
    }

    public void setVendido_por(String vendido_por) {
        this.vendido_por = vendido_por;
    }
    
    
}
