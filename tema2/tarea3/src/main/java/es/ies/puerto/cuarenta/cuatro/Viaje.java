package es.ies.puerto.cuarenta.cuatro;

/**
 * Crea una clase Viaje que tenga una lista (array)
 *  de destinos (clase Destinocon las propiedades
 * : pais, ciudad, fecha ). Implementa métodos para
 *  agregar destinos al itinerario y usa toString()
 *  para describir el viaje.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Viaje {
        private Destino[] destinos;
    private int tamanioLista;

    /**
     * Constructor vacio
     */
    public Viaje() {
    }

    /**
     * Constructor completo
     * @param tamanioLista
     */
    public Viaje( int tamanioLista) {
        this.destinos = new Destino[tamanioLista];
        this.tamanioLista = tamanioLista;
    }

    //Getters y Setters
    public Destino[] getDestinoes() {
        return this.destinos;
    }

    public void setDestinoes(Destino[] destinos) {
        this.destinos = destinos;
    }

    public int getTamanioLista() {
        return this.tamanioLista;
    }

    public void setTamanioLista(int tamanioLista) {
        this.tamanioLista = tamanioLista;
    }

    /**
     * Metodo que agrega un destino a la lista
     * @param destino
     */
    public void agregarDestino(Destino destino)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (destinos[i] == null )
            {
                destinos[i] = destino;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina una destino de la lista
     */
    public void eliminarDestino(Destino destino)
    {
        int i = destinos.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( destinos[i].equals(destino) )
            {
                destinos[i] = null;
                buscar = false;
            }
            i--;
        }
    }

    @Override
    public String toString() {
        String mensaje = "destinos: ";
        for (Destino destino : destinos) {
            if (destino != null) {
                mensaje += destino;
            }
        }
        return mensaje;
    }
}
