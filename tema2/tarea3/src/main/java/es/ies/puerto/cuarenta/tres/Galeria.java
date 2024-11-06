package es.ies.puerto.cuarenta.tres;

/**
 * Crea una clase Galeria que almacene una lista (array)
 *  de pinturas (clase Pintura, con las propiedades: anio,
 *  artista, precio ). Implementa métodos para agregar,
 *  eliminar y listar pinturas. Usa toString() para
 *  describir la galería.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Galeria {
    private Pintura[] pinturas;
    private int tamanioLista;

    /**
     * Constructor vacio
     */
    public Galeria() {
    }

    /**
     * Constructor completo
     * @param tamanioLista
     */
    public Galeria( int tamanioLista) {
        this.pinturas = new Pintura[tamanioLista];
        this.tamanioLista = tamanioLista;
    }

    //Getters y Setters
    public Pintura[] getPinturaes() {
        return this.pinturas;
    }

    public void setPinturaes(Pintura[] pinturas) {
        this.pinturas = pinturas;
    }

    public int getTamanioLista() {
        return this.tamanioLista;
    }

    public void setTamanioLista(int tamanioLista) {
        this.tamanioLista = tamanioLista;
    }

    /**
     * Metodo que agrega un pintura a la lista
     * @param pintura
     */
    public void agregarPintura(Pintura pintura)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (pinturas[i] == null )
            {
                pinturas[i] = pintura;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina una pintura de la lista
     */
    public void eliminarPintura(Pintura pintura)
    {
        int i = pinturas.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( pinturas[i].equals(pintura) )
            {
                pinturas[i] = null;
                buscar = false;
            }
            i--;
        }
    }

    @Override
    public String toString() {
        String mensaje = "pinturas: ";
        for (Pintura pintura : pinturas) {
            if (pintura != null) {
                mensaje += pintura;
            }
        }
        return mensaje;
    }
}