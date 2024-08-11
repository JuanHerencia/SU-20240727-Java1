package controller;
import model.Persona;
import model.Conductor;
import model.Vehiculo;
import model.Pasajero;
import model.Viaje;

/**
 *
 * @author Alumno
 */
public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("10203040", "Abel Abad");
        Persona p2 = new Persona("20304050", "Ana Arias");
        Persona p3 = new Persona("30405060", "Eliza Alva");
        p1.mostrar();
        Conductor c1 = new Conductor(p1, "A-II", "09/10/2019", "Si");
        c1.mostrar();
        System.out.println(c1.getNroLicencia());  // mostrar "Q10203040"
        System.out.println(c1.getEsVigente());  // true
        System.out.println("------------------------------------")        ;
        Vehiculo v1 = new Vehiculo("ABC-100","Toyota","Verde", 4);
        System.out.println(v1);
        Vehiculo v2 = new Vehiculo("BCD-200","Ford","Blanco", 10);
        System.out.println(v2);
        
        // Verificar si v1 es igual a v2
        if(v1.equals(v2)) { // v1 == v2  ?
            System.out.println("v1 y v2 son vehiculos iguales");
        } else {
            System.out.println("v1 y v2 son vehiculos diferentes");
        }
        
        Pasajero pas1 = new Pasajero(p2, "05/05/2023", "Si");
        System.out.println(pas1);
        System.out.println("----------- Viajes ---------------");
        Viaje viaje1 = new Viaje(v1,c1,pas1,"UNI","Plaza Bolognesi",
                "09/08/2024 10:35", "09/08/2024 10:55");
        System.out.println(viaje1);
        Pasajero pas2 = new Pasajero(p3, "05/05/2023", "No");
        Viaje viaje2 = new Viaje(v1,c1,pas2,"UNI","Plaza Bolognesi",
                "09/08/2024 10:35", "09/08/2024 10:55");
        System.out.println(viaje2);
    }
    
}
