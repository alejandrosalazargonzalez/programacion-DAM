package es.ies.puerto.cuarenta.cinco;

/**
 * Crea una clase Aeropuerto que almacene una
 *  lista (array) de vuelos (clase Vuelo, con
 *  las propiedades: aerolinea, fecha, numero).
 *  Implementa métodos para agregar y eliminar
 *  vuelos, y usa toString() para mostrar los
 *  detalles del aeropuerto.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Aeropuerto {
        private Vuelo[] vuelos;
    private int tamanioLista;

    /**
     * Constructor vacio
     */
    public Aeropuerto() {
    }

    /**
     * Constructor completo
     * @param tamanioLista
     */
    public Aeropuerto( int tamanioLista) {
        this.vuelos = new Vuelo[tamanioLista];
        this.tamanioLista = tamanioLista;
    }

    //Getters y Setters
    public Vuelo[] getVueloes() {
        return this.vuelos;
    }

    public void setVueloes(Vuelo[] vuelos) {
        this.vuelos = vuelos;
    }

    public int getTamanioLista() {
        return this.tamanioLista;
    }

    public void setTamanioLista(int tamanioLista) {
        this.tamanioLista = tamanioLista;
    }

    /**
     * Metodo que agrega un vuelo a la lista
     * @param vuelo
     */
    public void agregarVuelo(Vuelo vuelo)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (vuelos[i] == null )
            {
                vuelos[i] = vuelo;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina una vuelo de la lista
     */
    public void eliminarVuelo(Vuelo vuelo)
    {
        int i = vuelos.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( vuelos[i].equals(vuelo) )
            {
                vuelos[i] = null;
                buscar = false;
            }
            i--;
        }
    }

    @Override
    public String toString() {
        String mensaje = "vuelos: ";
        for (Vuelo vuelo : vuelos) {
            if (vuelo != null) {
                mensaje += vuelo;
            }
        }
        return mensaje;
    }
}
