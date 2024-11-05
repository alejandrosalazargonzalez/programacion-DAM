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
public class Biblioteca {
    
    Libro[] libros;
    private int numLibros;
    /**
     * Constructor por defecto
     */
    public Biblioteca() {}

    /**
     * Constructor completo
     * @param numLibros
     */
    public Biblioteca(int numLibros) {
        this.numLibros = 0;
        this.libros = new Libro[numLibros];
    }
    
    //Getters y Setters
    public Libro[] getLibros() {
        return this.libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public int getNumLibros() {
        return this.numLibros;
    }

    public void setNumLibros(int numLibros) {
        this.numLibros = numLibros;
    }

    /**
     * Metodo que agrega un libro a la Biblioteca
     * @param libro
     */
    public void agregarLibro(Libro libro)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (libros[i] == null )
            {
                libros[i] = libro;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina un libro de la Biblioteca
     */
    public void eliminarLibros(Libro libro)
    {
        int i = libros.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( libros[i].equals(libro) )
            {
                libros[i] = null;
                buscar = false;
            }
            i--;
        }
    }
    
    @Override
    public String toString() {
        String salida = "{ ";
        for (Libro libro : libros) {
            if ( libro != null) {
                salida += " " + libro + ";";
            }
        }
        salida += "}";
        return salida;
    }

}
