package es.ies.puerto.cuarenta.dos;

/**
 * Crea una clase Cine que almacene una lista (array)
 *  de proyecciones (clase Proyeccion, clase con propiedades:
 *  ciudad, hora, y fecha). Implementa métodos para agregar
 *  y eliminar proyecciones, y usa toString() para mostrar
 *  los detalles del cine.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Cine {
    private Proyeccion[] proyecciones;
    private int tamanioLista;

    /**
     * Constructor vacio
     */
    public Cine() {
    }

    /**
     * Constructor completo
     * @param tamanioLista
     */
    public Cine( int tamanioLista) {
        this.proyecciones = new Proyeccion[tamanioLista];
        this.tamanioLista = tamanioLista;
    }

    //Getters y Setters
    public Proyeccion[] getProyecciones() {
        return this.proyecciones;
    }

    public void setProyecciones(Proyeccion[] proyecciones) {
        this.proyecciones = proyecciones;
    }

    public int getTamanioLista() {
        return this.tamanioLista;
    }

    public void setTamanioLista(int tamanioLista) {
        this.tamanioLista = tamanioLista;
    }

    /**
     * Metodo que agrega un proyeccion a la lista
     * @param proyeccion
     */
    public void agregarProyeccion(Proyeccion proyeccion)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (proyecciones[i] == null )
            {
                proyecciones[i] = proyeccion;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina una proyeccion de la lista
     */
    public void eliminarProyeccion(Proyeccion proyeccion)
    {
        int i = proyecciones.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( proyecciones[i].equals(proyeccion) )
            {
                proyecciones[i] = null;
                buscar = false;
            }
            i--;
        }
    }

    @Override
    public String toString() {
        String mensaje = "proyecciones: ";
        for (Proyeccion proyeccion : proyecciones) {
            if (proyeccion != null) {
                mensaje += proyeccion;
            }
        }
        return mensaje;
    }
}
