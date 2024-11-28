package es.ies.puerto;
import java.util.ArrayList;

/**
 * Métodos a utilizar: add
 *
 *   Crea una clase Persona con atributos nombre, edad y dni.
 *   Crea una List<Persona> y añade cinco objetos Persona al ArrayList utilizando el método add.
 *   Usa un bucle para imprimir la información de todas las personas.
 *   Utiliza el if para encontrar a una persona especifica por su dni
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */

public class Ejercicio19 {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        Persona persona1 = new Persona("Alvaro", 23, "1");
        Persona persona2 = new Persona("Diego", 18, "2");
        Persona persona3 = new Persona("Carlos", 37, "3");
        Persona persona4 = new Persona("Hector",20,"4");
        Persona persona5 = new Persona("Adrian", 21, "5");
        
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);

        for (Persona persona : personas)
        {
            System.out.println(persona);
        }

        Persona buscar = new Persona("1");

        if (personas.contains(buscar))
        {
            System.out.println("La persona con dni: " + buscar.getDni() + " está en la lista.");
        } else
        {
            System.out.println("La persona con dni: " + buscar.getDni() + " no está en la lista.");
        }
        
    }
}