package es.ies.puerto;

/**
 * Crea una clase Persona con los siguientes atributos:
 *
 *   nombre (String)
 *   edad (int)
 *   dni (String)
 *
 * Define los métodos necesarios:
 *
 *   Constructor que permita inicializar todos los atributos.
 *   Método esMayorDeEdad que devuelva true si la persona es mayor de edad (edad >= 18) y false en caso contrario.
 *
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Persona persona = new Persona("Manolo", 20, "12345678b");
        System.out.println( persona );
        
        Persona otraPersona = new Persona("Manolo", 20, "12345678b");
        System.out.println(persona.equals(otraPersona));
    }
}
