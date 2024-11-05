package es.ies.puerto.treinta.cero;

import es.ies.puerto.veinte.cuatro.Animal;

/**
 * Crea una clase Playlist que almacene una lista(array) de
 *  canciones (clase Cancion). Implementa métodos para
 *  agregar, eliminar y listar canciones. Usa toString()
 *  para mostrar la lista.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Playlist {
    private Cancion[] canciones;
    private int tamanioLista;

    /**
     * Constructor vacio
     */
    public Playlist() {
    }

    /**
     * Constructor completo
     * @param tamanioLista
     */
    public Playlist( int tamanioLista) {
        this.canciones = new Cancion[tamanioLista];
        this.tamanioLista = tamanioLista;
    }

    //Getters y Setters
    public Cancion[] getCanciones() {
        return this.canciones;
    }

    public void setCanciones(Cancion[] canciones) {
        this.canciones = canciones;
    }

    public int getTamanioLista() {
        return this.tamanioLista;
    }

    public void setTamanioLista(int tamanioLista) {
        this.tamanioLista = tamanioLista;
    }

        /**
     * Metodo que agrega un libro a la Biblioteca
     * @param libro
     */
    public void agregarLibro(Cancion cancion)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (canciones[i] == null )
            {
                canciones[i] = cancion;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina una cancion de la lista
     */
    public void eliminarLibros(Cancion cancion)
    {
        int i = canciones.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( canciones[i].equals(cancion) )
            {
                canciones[i] = null;
                buscar = false;
            }
            i--;
        }
    }

    @Override
    public String toString() {
        String mensaje = "canciones: ";
        for (Cancion cancion : canciones) {
            if (cancion != null) {
                mensaje += cancion;
            }
        }
        return mensaje;
    }

}
