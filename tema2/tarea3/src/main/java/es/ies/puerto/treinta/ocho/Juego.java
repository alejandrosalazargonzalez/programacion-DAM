package es.ies.puerto.treinta.ocho;

/**
 * Crea una clase Juego que almacene una lista (array)
 *  de jugadores (clase Jugador). Implementa métodos para
 *  agregar y eliminar jugadores, y usar toString() para
 *  mostrar los detalles del juego.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Juego {
    private Jugador[] jugadores;
    private int tamanioLista;

    /**
     * Constructor vacio
     */
    public Juego() {
    }

    /**
     * Constructor completo
     * @param tamanioLista
     */
    public Juego( int tamanioLista) {
        this.jugadores = new Jugador[tamanioLista];
        this.tamanioLista = tamanioLista;
    }

    //Getters y Setters
    public Jugador[] getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public int getTamanioLista() {
        return this.tamanioLista;
    }

    public void setTamanioLista(int tamanioLista) {
        this.tamanioLista = tamanioLista;
    }

    /**
     * Metodo que agrega un jugador a la lista
     * @param jugador
     */
    public void agregarJugador(Jugador jugador)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (jugadores[i] == null )
            {
                jugadores[i] = jugador;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina una jugador de la lista
     */
    public void eliminarJugador(Jugador jugador)
    {
        int i = jugadores.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( jugadores[i].equals(jugador) )
            {
                jugadores[i] = null;
                buscar = false;
            }
            i--;
        }
    }

    @Override
    public String toString() {
        String mensaje = "jugadores: ";
        for (Jugador jugador : jugadores) {
            if (jugador != null) {
                mensaje += jugador;
            }
        }
        return mensaje;
    }
}
