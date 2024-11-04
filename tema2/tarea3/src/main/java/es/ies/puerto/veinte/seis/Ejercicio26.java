package es.ies.puerto.veinte.seis;

import es.ies.puerto.cinco.Libro;

/**
 * Crea una clase Biblioteca que almacene una lista (array)
 *  de libros (clase Libro). Implementa métodos para agregar
 *  libros, eliminar libros y listar todos los libros. Usa 
 * toString() para describir la biblioteca.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio26 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(3);
        Libro libro1 = new Libro("Pepito el chocolate", "Pedro", 100);
        Libro libro2 = new Libro("Las locas aventuras", "El loco aventuras", 300);
        Libro libro3 = new Libro("Lagrimas mojadas", "Luisa Perez", 200);

        System.out.println(biblioteca);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println(biblioteca);

        Libro eliminaLibro = new Libro("Prohibido", 100);
        biblioteca.eliminarLibros(eliminaLibro);

        System.out.println(biblioteca);
    }
}
