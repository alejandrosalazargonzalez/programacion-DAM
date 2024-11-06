package es.ies.puerto.cuarenta.seis;

/**
 * Crea una clase Restaurante que tenga una
 *  lista (array) de reservas (clase Reserva,
 *  con las propiedades: fecha, numero,
 *  comensales ). Implementa métodos para
 *  agregar y eliminar reservas y usa toString()
 *  para mostrar los detalles del restaurante.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Restaurante {
        private Reserva[] reservas;
    private int tamanioLista;

    /**
     * Constructor vacio
     */
    public Restaurante() {
    }

    /**
     * Constructor completo
     * @param tamanioLista
     */
    public Restaurante( int tamanioLista) {
        this.reservas = new Reserva[tamanioLista];
        this.tamanioLista = tamanioLista;
    }

    //Getters y Setters
    public Reserva[] getReservaes() {
        return this.reservas;
    }

    public void setReservaes(Reserva[] reservas) {
        this.reservas = reservas;
    }

    public int getTamanioLista() {
        return this.tamanioLista;
    }

    public void setTamanioLista(int tamanioLista) {
        this.tamanioLista = tamanioLista;
    }

    /**
     * Metodo que agrega un reserva a la lista
     * @param reserva
     */
    public void agregarReserva(Reserva reserva)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (reservas[i] == null )
            {
                reservas[i] = reserva;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina una reserva de la lista
     */
    public void eliminarReserva(Reserva reserva)
    {
        int i = reservas.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( reservas[i].equals(reserva) )
            {
                reservas[i] = null;
                buscar = false;
            }
            i--;
        }
    }

    @Override
    public String toString() {
        String mensaje = "reservas: ";
        for (Reserva reserva : reservas) {
            if (reserva != null) {
                mensaje += reserva;
            }
        }
        return mensaje;
    }
}
