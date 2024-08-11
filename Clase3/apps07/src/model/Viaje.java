package model;

/**
 *
 * @author Alumno
 */
public class Viaje {

    private Vehiculo vehiculo;
    private Conductor conductor;
    private Pasajero pasajero;
    private String lug_origen;
    private String lug_destino;
    private String fechora_origen;
    private String fechora_destino;
    private boolean viaje_aceptado;
    private double costo;
    private boolean viaje_terminado;

    public Viaje(Vehiculo vehiculo, Conductor conductor, Pasajero pasajero,
            String lug_origen, String lug_destino, String fechora_origen,
            String fechora_destino) {
        this.vehiculo = vehiculo;
        if (conductor.getEsVigente()) {
            this.conductor = conductor;
        } else {
            this.conductor = null;
        }
        if (pasajero.isEstado_vigente()) {
            this.pasajero = pasajero;
        } else {
            this.pasajero = null;
        }
        this.lug_origen = lug_origen;
        this.lug_destino = lug_destino;
        this.fechora_origen = fechora_origen;
        this.fechora_destino = fechora_destino;

        if (this.conductor == null || this.pasajero == null) {
            this.viaje_aceptado = false;
        } else {
            this.viaje_aceptado = true;
        }
        this.viaje_terminado = false;
    }

    public Viaje(Pasajero pasajero, String lug_origen, String lug_destino) {
        this.vehiculo = null; // los objetos sin valor
        this.conductor = null; // se inicializan con null (nulo)
        this.pasajero = pasajero;
        this.lug_origen = lug_origen;
        this.lug_destino = lug_destino;
        this.fechora_origen = "";
        this.fechora_destino = "";
        this.viaje_aceptado = false;
        this.viaje_terminado = false;
    }

    public void setViajeTerminado(boolean viaje_terminado) {
        this.viaje_terminado = viaje_terminado;
    }
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        if (conductor.getEsVigente()) {
            this.conductor = conductor;
        } else {
            this.conductor = null;
        }
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        if (pasajero.isEstado_vigente()) {
            this.pasajero = pasajero;
        } else {
            this.pasajero = null;
        }
    }

    public void validarViaje() {
        if (this.conductor == null || this.pasajero == null) {
            this.viaje_aceptado = false;
        } else {
            this.viaje_aceptado = true;
        }
    }

    public String getLug_origen() {
        return lug_origen;
    }

    public void setLug_origen(String lug_origen) {
        this.lug_origen = lug_origen;
    }

    public String getLug_destino() {
        return lug_destino;
    }

    public void setLug_destino(String lug_destino) {
        this.lug_destino = lug_destino;
    }

    public String getFechora_origen() {
        return fechora_origen;
    }

    public void setFechora_origen(String fechora_origen) {
        this.fechora_origen = fechora_origen;
    }

    public String getFechora_destino() {
        return fechora_destino;
    }

    public void setFechora_destino(String fechora_destino) {
        this.fechora_destino = fechora_destino;
    }

    public boolean isViaje_aceptado() {
        return viaje_aceptado;
    }

    public void setViaje_aceptado(boolean viaje_aceptado) {
        this.viaje_aceptado = viaje_aceptado;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isViaje_terminado() {
        return viaje_terminado;
    }

    public void setViaje_terminado(boolean viaje_terminado) {
        this.viaje_terminado = viaje_terminado;
    }

    @Override
    public String toString() {
        if (this.viaje_aceptado) {
            conductor.mostrar();
            String s = "-----Vehiculo------\n" + vehiculo
                    + "-----Pasajero------\n" + pasajero
                    + "Lugar de origen : " + lug_origen + "\n"
                    + "Lugar de destino: " + lug_destino + "\n";
            if(this.viaje_terminado) {
                s = s + "Hora origen     : " + fechora_origen + "\n"
                    + "Hora destino    : " + fechora_destino;
            }
            return s;
        } else {
            return "Viaje no aceptado";
        }
    }

}
