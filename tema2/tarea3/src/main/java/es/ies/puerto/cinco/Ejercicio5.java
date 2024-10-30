package es.ies.puerto.cinco;

/**
 * Define una clase Libro con atributos titulo, autor y paginas.
 *  Crea varios constructores para inicializar diferentes
 *  combinaciones de estos atributos. Implementa toString() para
 *  devolver una descripción del libro.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Libro libro = new Libro("El Quijote", "Miguel de Cervantes", 2000);

        System.out.println(libro);
    }
}
