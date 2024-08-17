import java.util.ArrayList;

/**
 * Write a description of class HorarioCurso here.
 * 
 * @author Juan Herencia
 * @version 13/08/2024
 */
public class HorarioCurso
{
    private Curso curso;
    private Docente docente;
    private ArrayList dia_hora; 
    
    class DiaHora {
        private String dia;
        private String hora;
        
        public DiaHora(String dia, String hora)
        {
            this.dia = dia;
            this.hora = hora;
        }
        
        public String getDia() {
            return dia;
        }
        
        public String getHora() {
            return hora;
        }
    }
    
    HorarioCurso(Curso curso, Docente docente) 
    {
        this.curso = curso;
        this.docente = docente;
        this.dia_hora = new ArrayList();
    }
    
    public void addDiaHora(String dia, String hora)
    {
        dia_hora.add(new DiaHora(dia, hora));
    }
    
    public void show()
    {
        System.out.println("------------ Curso -------------");
        System.out.println("Horario del curso " + curso.getNombre());
        System.out.println("Docente " + docente.getNombres());
        for(Object d: dia_hora) 
        {
            DiaHora fh = (DiaHora)d;
            System.out.println("Dia " + fh.getDia() + ", Hora " + fh.getHora());    
        }
    }

}

