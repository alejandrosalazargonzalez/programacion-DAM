package es.ies.puerto;

/**
 * Ejercicio 13
 *  Crea una clase Alumno con los atributos nombre y nota.
 *  Implementa un método que determine si el alumno
 *  ha aprobado (nota >= 6).
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Alumno alumno = new Alumno ("Ana", 7f );
        System.out.println(alumno.toString());
        Alumno alumno2 = new Alumno("Jose Miguel", 100);
        System.out.println(alumno2);
    }
}
