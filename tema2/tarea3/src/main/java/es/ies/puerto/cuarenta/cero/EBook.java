package es.ies.puerto.cuarenta.cero;
import java.util.Objects;

/**
 * Crea una clase BibliotecaDigital que almacene
 *  una lista (array) de e-books (clase EBook
 *  (con las propiedades: nombre isbn, y anio)).
 *  Implementa métodos para agregar, eliminar y
 *  buscar libros, y usa toString() para mostrar
 *  los detalles de la biblioteca.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class EBook {
    private String nombre;
    private int isbn;
    private int anio;

    /**
     * Constructor vacio
     */
    public EBook() {
    }

    /**
     * Constructor completo
     * @param nombre
     * @param isbn
     * @param anio
     */
    public EBook(String nombre, int isbn, int anio) {
        this.nombre = nombre;
        this.isbn = isbn;
        this.anio = anio;
    }

    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIsbn() {
        return this.isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EBook)) {
            return false;
        }
        EBook eBook = (EBook) o;
        return isbn == eBook.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, isbn, anio);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", isbn='" + getIsbn() + "'" +
            ", anio='" + getAnio() + "'" +
            "}";
    }
    
}
