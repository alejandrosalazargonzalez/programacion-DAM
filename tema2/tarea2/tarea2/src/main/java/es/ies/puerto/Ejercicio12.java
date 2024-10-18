package es.ies.puerto;

/**
 * Crea una clase Libro con los atributos titulo, autor y paginas.
 *  Usa getters y setters para cada atributo, y asegura que el
 *  número de páginas sea un entero positivo.
 *
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setAutor("Cervantes");
        libro.setPaginas(500);
        libro.setTitulo("El Quijote");

        System.out.println(libro);
    }
}
