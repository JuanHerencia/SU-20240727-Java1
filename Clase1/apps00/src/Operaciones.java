/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class Operaciones {
    public static void main(String[] argumentos) {
        int a = 30, b = 7; // declaración e inicialización de variables de tipo numérico entero
        float r;  // declaración de variable real de tipo flotante simple
        double x; // declaracion de variable real de tipo flotante doble
        String str; // declaración de tipo texto
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //System.out.println("r = " + r + "\nx = " + x); // tienen que ser inicializados
        
        // ************* Operaciones aritmeticas
        // division real
        System.out.println("************* Operaciones aritmeticas *************");
        r = 1.0f * a / b; // = es asignación
        System.out.println("1.0f * a / b es " + r);
        
        // division entera
        r = a / b;
        System.out.println("a / b es " + r);
        
        // resto de division
        r = a % b;  // % es porcentaje
        System.out.println("a % b es " + r);
        
        // ************* Operaciones de comparacion
        System.out.println("************* Operaciones de comparacion *************");
        boolean s;  // tipo booleano solo es true o false
        
        // >, <, >=, <=, ==, !=
        s = a > b; // se lee ¿a es mayor que b?
        System.out.println("a > b resulta " + s);
        
        s = a == b;  // ¿a es igual a b?
        System.out.println("a == b resulta " + s);
        
        s = a != b;  // ¿a es diferente a b?
        System.out.println("a != b resulta " + s);
        
        // ************* Operaciones lógicas
        System.out.println("************* Operaciones lógicas *************");
        
        // || (o lógico), && (y lógico), ! (negación)
        s = a > b && a - 25 > 33; // true && false es false
        System.out.println("a > b && a - 25 > 33 resulta " + s);
        
        s = a > b || a - 25 > 33; // true || false es true
        System.out.println("a > b && a - 25 > 33 resulta " + s);
        
        s = !(a > b) || a - 25 > 33; // !(true) || false es false
        System.out.println("!(a > b) || a - 25 > 33; resulta " + s);
        
        str = "Programa terminado correctamente";
        String nuevo_str = "OK";
        System.out.println(str + " " + nuevo_str);
    }   
}
