package es.ies.puerto.treinta.seis;

/**
 * Crea una clase ColeccionMonedas que almacene
 *  una lista (array) de monedas (clase Moneda).
 *  Implementa métodos para agregar monedas y
 *  listar todas las monedas. Usa toString()
 *  para mostrar detalles de la colección.
 *
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class ColeccionMonedas {
    private Moneda[] monedas;
    private int tamanioLista;

    /**
     * Constructor vacio
     */
    public ColeccionMonedas() {
    }

    /**
     * Constructor completo
     * @param tamanioLista
     */
    public ColeccionMonedas( int tamanioLista) {
        this.monedas = new Moneda[tamanioLista];
        this.tamanioLista = tamanioLista;
    }

    //Getters y Setters
    public Moneda[] getMonedas() {
        return this.monedas;
    }

    public void setMonedas(Moneda[] monedas) {
        this.monedas = monedas;
    }

    public int getTamanioLista() {
        return this.tamanioLista;
    }

    public void setTamanioLista(int tamanioLista) {
        this.tamanioLista = tamanioLista;
    }

        /**
     * Metodo que agrega un moneda a la lista
     * @param moneda
     */
    public void agregarCancion(Moneda moneda)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (monedas[i] == null )
            {
                monedas[i] = moneda;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina una moneda de la lista
     */
    public void eliminarCancion(Moneda moneda)
    {
        int i = monedas.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( monedas[i].equals(moneda) )
            {
                monedas[i] = null;
                buscar = false;
            }
            i--;
        }
    }

    @Override
    public String toString() {
        String mensaje = "monedas: ";
        for (Moneda moneda : monedas) {
            if (moneda != null) {
                mensaje += moneda;
            }
        }
        return mensaje;
    }
}
