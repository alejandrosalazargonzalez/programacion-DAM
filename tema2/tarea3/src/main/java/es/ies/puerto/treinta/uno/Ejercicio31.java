package es.ies.puerto.treinta.uno;


/**
 * Crea una clase Pelicula con atributos titulo,
 *  director, y duracion. Implementa métodos
 *  para comparar películas por duración con
 *  equals() y usar toString() para mostrar detalles.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio31 {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Alien", "Ridley Scott", 1.57f);

        System.out.println(pelicula);
    }
}
