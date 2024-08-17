package model;

/**
 *
 * @author Alumno
 */
public class Fecha {
    private int dia_int, mes_int, año_int, 
            hora, min, seg; 
    public Fecha() {
        // La fecha actual es 17/08/2024
        dia_int = 17;
        mes_int = 8;
        año_int = 2024;
        hora = 0;
        min = 0;
        seg = 0;
    }
    
    public Fecha(int dia_int, int mes_int, int año_int,
            int hora, int min, int seg) {
        this.dia_int = dia_int;
        this.mes_int = mes_int;
        this.año_int = año_int;
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }
    
    public Fecha(int dia_int, int mes_int, int año_int) {
        this.dia_int = dia_int;
        this.mes_int = mes_int;
        this.año_int = año_int;
        hora = 0;
        min = 0;
        seg = 0;
    }

    public int getDia_int() {
        return dia_int;
    }

    public void setDia_int(int dia_int) {
        this.dia_int = dia_int;
    }

    public int getMes_int() {
        return mes_int;
    }

    public void setMes_int(int mes_int) {
        this.mes_int = mes_int;
    }

    public int getAño_int() {
        return año_int;
    }

    public void setAño_int(int año_int) {
        this.año_int = año_int;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Fecha other = (Fecha) obj;
        if (this.dia_int != other.dia_int) {
            return false;
        }
        if (this.mes_int != other.mes_int) {
            return false;
        }
        if (this.año_int != other.año_int) {
            return false;
        }
        if (this.hora != other.hora) {
            return false;
        }
        if (this.min != other.min) {
            return false;
        }
        return this.seg == other.seg;
    }

    @Override
    public String toString() {
        if(hora == 0 && min == 0 && seg == 0) {
            return dia_int + "/" + mes_int + "/" + año_int;
        } else {
            return dia_int + "/" + mes_int + "/" + año_int + " " + hora + ":" + min + ":" + seg;
        }
    }
    
    // La diferencia de fecha en años
    // Considerar a fecha1 mayor a fecha2
    public int diferenciaFecha(Fecha fecha1, Fecha fecha2) {
        return fecha1.getAño_int() - fecha2.getAño_int();
    }

}
