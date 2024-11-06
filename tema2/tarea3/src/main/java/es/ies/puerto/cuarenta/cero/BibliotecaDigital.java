package es.ies.puerto.cuarenta.cero;

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
public class BibliotecaDigital {
    private EBook[] eBooks;
    private int tamanioLista;

    /**
     * Constructor vacio
     */
    public BibliotecaDigital() {
    }

    /**
     * Constructor completo
     * @param tamanioLista
     */
    public BibliotecaDigital( int tamanioLista) {
        this.eBooks = new EBook[tamanioLista];
        this.tamanioLista = tamanioLista;
    }

    //Getters y Setters
    public EBook[] getEBookes() {
        return this.eBooks;
    }

    public void setEBookes(EBook[] eBooks) {
        this.eBooks = eBooks;
    }

    public int getTamanioLista() {
        return this.tamanioLista;
    }

    public void setTamanioLista(int tamanioLista) {
        this.tamanioLista = tamanioLista;
    }

    /**
     * Metodo que agrega un eBooks a la lista
     * @param eBook
     */
    public void agregarEBook(EBook eBook)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (eBooks[i] == null )
            {
                eBooks[i] = eBook;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina una eBook de la lista
     */
    public void eliminarEBook(EBook eBook)
    {
        int i = eBooks.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( eBooks[i].equals(eBook) )
            {
                eBooks[i] = null;
                buscar = false;
            }
            i--;
        }
    }

    @Override
    public String toString() {
        String mensaje = "eBooks: ";
        for (EBook eBook : eBooks) {
            if (eBook != null) {
                mensaje += eBook;
            }
        }
        return mensaje;
    }
}
