package es.ies.puerto.dies.cero;

/**
 * Crea una clase Pila (simulando una estructura de datos LIFO)
 *  con métodos apilar() y desapilar(). Usa un array para
 *  almacenar los datos y sobrescribe toString() para mostrar
 *  el contenido de la pila.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Pila {
    
    private String[] datos;

    /**
     * Constructor vacio
     */
    public Pila() {
    }

    /**
     * Constructor completo
     * @param datos
     */
    public Pila(String[] datos) {
        this.datos = datos;
    }

    // Getters y Setters
    public String[] getDatos() {
        return this.datos;
    }

    public void setDatos(String[] datos) {
        this.datos = datos;
    }
    
    /**
     * Metodo que agrega un dato a la pila
     * @param dato
     */
    public void apilar(String dato)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar) 
        {
            if (datos[i] == null ) 
            {
                datos[i] = dato;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina el ultimo valor añadido a la pila
     */
    public void desapilar()
    {
        int i = datos.length - 1;
        boolean buscar = true;
        while (buscar) 
        {
            if (!datos[i].equals(null) ) 
            {
                datos[i] = null;
                buscar = false;
            }
            i--;
        }
    }


    @Override
    public String toString() {
        String contenido = "{ ";
        for (String string : datos) {
            contenido += "(" + string + ");";
        }
        contenido += "}";
        return contenido;
    }


}
