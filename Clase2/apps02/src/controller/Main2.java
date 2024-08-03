package controller;
import model.Persona;
import model.Empleado;
/**
 *
 * @author Alumno
 */
public class Main2 {
    
    public static void main(String[] args) {
        Persona p1 = new Persona("10002000", "Maria", "Flores", "Sin Email", 25 );
        Empleado e1 = new Empleado(12345, p1, 5000, "Desarrollador Web", "10/10/2020");
        e1.mostrar(); // se muestra los datos del empleado
        Empleado e2 = new Empleado(12346, new Persona("55557777", "Rita", "Perez",
                                   "rperez@gmail.com", 35), 3000, "Asistente", "02/01/2018");
        e2.mostrar();
        // Modificacion de e2
        e2.setSueldo(10000);
        e2.setCargo("Jefe");
        e2.setPersona(new Persona("55557777", "Margarita", "Perez Perez", "rperez@gmail.com", 35));
        e2.mostrar();
    }
}
