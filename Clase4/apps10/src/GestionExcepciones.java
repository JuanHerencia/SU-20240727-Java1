/**
 *
 * @author Alumno
 */
public class GestionExcepciones {
    public static void main(String[] args) {
        try {
            int resultado = dividir(10,0);
            System.out.println("Resultado : "+resultado);
        } catch(ArithmeticException e) { 
            System.out.println("Se ha producido un division entre cero");
        } catch(Exception e) { // Exception es para cualquier error
            System.out.println("Se ha producido un error desconocido");
        }
        System.out.println("Programa terminado correctamente");
    }
    
    public static int dividir(int a, int b) {
        // ArithmeticException es error de división entre cero
        return a / b;
    }
    
}
