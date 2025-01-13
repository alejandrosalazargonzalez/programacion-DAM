package es.ies.puerto.set;

import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.Libro;
/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class LibroSet {
    Set<Libro> libros;

    /**
     * constructor vacio
     */
    public LibroSet() {
        this.libros = new HashSet<>();
    }

    /**
     * Agrega un libro a la lista
     * @param libro
     * @return true/false
     */
    public boolean agregar(Libro libro) {
        if (libro == null) {
            return false;
        }

        return libros.add(libro);
    }

    /**
     * Lista los libros
     * @return hashset de los libros
     */
    public Set<Libro> listar() {
        return new HashSet(libros);
    }

    /**
     * busca libros por su isbn
     * @param isbn
     * @return null o libro
     */
    public Libro buscar(String isbn) {
                if (isbn == null || isbn.isEmpty()) {
            return null;
        }
        Libro libroBuscado = new Libro(isbn);
        for (Libro libro : libros) {
            if (libro.equals(libroBuscado)) {
                return libro;
            }
        }
        return null;     
    }

    /**
     * Actualiza un libro
     * @param isbn
     * @param libro
     * @return true/fasle
     */
    public boolean actualizar(String isbn, Libro libro) {
        if (isbn == null || isbn.isEmpty() || libro == null) {
            return false;
        }
        Libro libroBuscado = new Libro(isbn);
        if (libros.contains(libroBuscado)) {
            libros.remove(libroBuscado);
            libros.add(libro);
            return true;
        }
        return false;
    }

    /**
     * elimina un libro
     * @param isbn
     * @return true/false
     */
    public boolean eliminar(String isbn) {
        if (isbn == null || isbn.isEmpty()) {
            return false;
        }
        Libro libroEliminar = new Libro(isbn);
        return libros.remove(libroEliminar);
    }

}
