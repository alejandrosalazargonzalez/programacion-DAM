package es.ies.puerto.set;

import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.Libro;

public class LibroSet {
    Set<Libro> libros;

    public LibroSet() {

    }

    public boolean agregar(Libro libro) {
        return false;
    }

    public Set<Libro> listar() {
        return new HashSet();
    }

    public Libro buscar(String isbn) {
        return null;     
    }

    public boolean actualizar(String isbn, Libro libro) {
        return false;
    }

    public boolean eliminar(String isbn) {
        return false;
    }

}
