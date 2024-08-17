
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String x[]) {
        // Creando curso
        Curso c1 = new Curso(125, "Matemática I");
        Curso c2 = new Curso(126, "Matemática II");
        // Creando el docente
        Docente d1 = new Docente(new Persona("12345678", "Ana Abad", "aabad@gmail.com"),
                         1010, "Ingeniería Eléctrica" );
        d1.show();
        // Creando horarop de Matemáticas I
        HorarioCurso horario_mate1 = new HorarioCurso(c1, d1);
        // Agregar los dias y horas de clase
        horario_mate1.addDiaHora("LUNES","14-16");
        horario_mate1.addDiaHora("MIERCOLES","08-12");
        horario_mate1.addDiaHora("VIERNES","10-12");
        horario_mate1.addDiaHora("SABADOS","16-20");
        horario_mate1.show();
    }
}
