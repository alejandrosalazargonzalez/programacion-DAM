package es.ies.puerto.treinta.tres;

/**
 * Crea una clase Computadora con atributos marca,
 *  modelo y una lista (array) de componentes (como 
 *  Procesador, RAM, etc.). Implementa métodos para
 *  agregar componentes y usar toString() para
 *  describir la computadora.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Computadora {
    private Componente[] componentes;
    private int numeroComponentes;

        /**
     * Constructor por defecto
     */
    public Computadora() {}

    /**
     * Constructor completo
     * @param numeroComponentes
     */
    public Computadora(int numeroComponentes) {
        this.numeroComponentes = 0;
        this.componentes = new Componente[numeroComponentes];
    }
    
    //Getters y Setters
    public Componente[] getcomponentes() {
        return this.componentes;
    }

    public void setcomponentes(Componente[] componentes) {
        this.componentes = componentes;
    }

    public int getNumeroComponentes() {
        return this.numeroComponentes;
    }

    public void setNumeroComponentes(int numeroComponentes) {
        this.numeroComponentes = numeroComponentes;
    }

    /**
     * Metodo que agrega un componente a la Computadora
     * @param componenteaciente
     */
    public void agregarcomponente(Componente componente)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (componentes[i] == null )
            {
                componentes[i] = componente;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina un componente de la Computadora
     */
    public void eliminarcomponentes(Componente componente)
    {
        int i = componentes.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( componentes[i].equals(componente) )
            {
                componentes[i] = null;
                buscar = false;
            }
            i--;
        }
    }
    
    @Override
    public String toString() {
        String salida = "{ ";
        for (Componente componente : componentes) {
            if ( componente != null) {
                salida += " " + componente + ";";
            }
        }
        salida += "}";
        return salida;
    }
}
