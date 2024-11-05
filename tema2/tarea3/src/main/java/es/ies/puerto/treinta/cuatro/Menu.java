package es.ies.puerto.treinta.cuatro;

/**
 * Crea una clase Restaurante con una lista (array)
 *  de platos (clase Plato). Implementa métodos
 *  para agregar y eliminar platos del menú y usar
 *  toString() para mostrar los detalles del
 *  restaurante.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Menu {
    private Plato[] platos;
    private int numeroPlatos;

    /**
     * Constructor por defecto
     */
    public Menu() {}

    /**
     * Constructor completo
     * @param numeroPlatos
     */
    public Menu(int numeroPlatos) {
        this.numeroPlatos = 0;
        this.platos = new Plato[numeroPlatos];
    }
    
    //Getters y Setters
    public Plato[] getPlatos() {
        return this.platos;
    }

    public void setPlatos(Plato[] platos) {
        this.platos = platos;
    }

    public int getNumeroPlatos() {
        return this.numeroPlatos;
    }

    public void setNumeroPlatos(int numeroPlatos) {
        this.numeroPlatos = numeroPlatos;
    }

    /**
     * Metodo que agrega un plato a la Plato
     * @param Plato
     */
    public void agregarPlato(Plato plato)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (platos[i] == null )
            {
                platos[i] = plato;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina un plato del Menu
     */
    public void eliminarPlatos(Plato plato)
    {
        int i = platos.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( platos[i].equals(plato) )
            {
                platos[i] = null;
                buscar = false;
            }
            i--;
        }
    }
    
    @Override
    public String toString() {
        String salida = "{ ";
        for (Plato plato : platos) {
            if ( plato != null) {
                salida += " " + plato + ";";
            }
        }
        salida += "}";
        return salida;
    }
}
