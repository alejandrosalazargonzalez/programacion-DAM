package es.ies.puerto.cuarenta.ocho;

/**
 * Crea una clase Parque con una lista (array) de
 *  atracciones (clase Atraccion, con las propiedades:
 * precio, nombre). Implementa métodos para agregar y
 *  eliminar atracciones, y usa toString() para describir
 *  el parque.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Parque {
    private Atraccion[] atracciones;
    private int tamanioLista;

    /**
     * Constructor vacio
     */
    public Parque() {
    }

    /**
     * Constructor completo
     * @param tamanioLista
     */
    public Parque( int tamanioLista) {
        this.atracciones = new Atraccion[tamanioLista];
        this.tamanioLista = tamanioLista;
    }

    //Getters y Setters
    public Atraccion[] getAtracciones() {
        return this.atracciones;
    }

    public void setAtracciones(Atraccion[] atracciones) {
        this.atracciones = atracciones;
    }

    public int getTamanioLista() {
        return this.tamanioLista;
    }

    public void setTamanioLista(int tamanioLista) {
        this.tamanioLista = tamanioLista;
    }

    /**
     * Metodo que agrega un atraccion a la lista
     * @param atraccion
     */
    public void agregarAtraccion(Atraccion atraccion)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (atracciones[i] == null )
            {
                atracciones[i] = atraccion;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina una atraccion de la lista
     */
    public void eliminarAtraccion(Atraccion atraccion)
    {
        int i = atracciones.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( atracciones[i].equals(atraccion) )
            {
                atracciones[i] = null;
                buscar = false;
            }
            i--;
        }
    }

    @Override
    public String toString() {
        String mensaje = "atracciones: ";
        for (Atraccion atraccion : atracciones) {
            if (atraccion != null) {
                mensaje += atraccion;
            }
        }
        return mensaje;
    }
}
