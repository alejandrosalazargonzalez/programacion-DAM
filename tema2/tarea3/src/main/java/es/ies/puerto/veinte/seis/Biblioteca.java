package es.ies.puerto.veinte.seis;

import es.ies.puerto.cinco.Libro;

public class Biblioteca {
    
        Libro[] libros;
    private int numLibros;
    /**
     * Constructor por defecto
     */
    public Biblioteca() {}


    public Biblioteca(int numLibros) {
        this.numLibros = 0;
        this.libros = new Libro[numLibros];
    }
    
}
