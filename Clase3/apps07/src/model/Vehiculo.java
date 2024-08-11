package model;

import java.util.Objects;

/**
 *
 * @author Alumno
 */
public class Vehiculo {
    private String nro_placa;
    private String marca;
    private String color;
    private int cant_pasajeros;

    public Vehiculo(String nro_placa, String marca, String color, int cant_pasajeros) {
        this.nro_placa = nro_placa;
        this.marca = marca;
        this.color = color;
        this.cant_pasajeros = cant_pasajeros;
    }

    public String getNro_placa() {
        return nro_placa;
    }

    public void setNro_placa(String nro_placa) {
        this.nro_placa = nro_placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCant_pasajeros() {
        return cant_pasajeros;
    }

    public void setCant_pasajeros(int cant_pasajeros) {
        this.cant_pasajeros = cant_pasajeros;
    }

    @Override
    public int hashCode() {
        int hash = 7; // con esto pueden hacer su propio hash
        hash = 79 * hash + Objects.hashCode(this.nro_placa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        return Objects.equals(this.nro_placa, other.nro_placa);
    }

    @Override
    public String toString() {
        String s = "Nro placa             : " + nro_placa + "\n" +
                   "Marca                 : " + marca + "\n" +
                   "Color                 : " + color + "\n" + 
                   "Cantidad de pasajeros : " + cant_pasajeros + "\n";
        return s;
    }
    
    
    
}
