package es.ies.puerto.cuarenta.nueve;

/**
 * Crea una clase Escuela que almacene una lista (array)
 *  de profesores. Implementa métodos para agregar y
 *  eliminar profesores, y usa toString() para describir
 *  la escuela.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Escuela {
    
        private Profesor[] profesores;
    private int tamanioLista;

    /**
     * Constructor vacio
     */
    public Escuela() {
    }

    /**
     * Constructor completo
     * @param tamanioLista
     */
    public Escuela( int tamanioLista) {
        this.profesores = new Profesor[tamanioLista];
        this.tamanioLista = tamanioLista;
    }

    //Getters y Setters
    public Profesor[] getProfesores() {
        return this.profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }

    public int getTamanioLista() {
        return this.tamanioLista;
    }

    public void setTamanioLista(int tamanioLista) {
        this.tamanioLista = tamanioLista;
    }

    /**
     * Metodo que agrega un profesor a la lista
     * @param profesor
     */
    public void agregarProfesor(Profesor profesor)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (profesores[i] == null )
            {
                profesores[i] = profesor;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina una profesor de la lista
     */
    public void eliminarProfesor(Profesor profesor)
    {
        int i = profesores.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( profesores[i].equals(profesor) )
            {
                profesores[i] = null;
                buscar = false;
            }
            i--;
        }
    }

    @Override
    public String toString() {
        String mensaje = "profesores: ";
        for (Profesor profesor : profesores) {
            if (profesor != null) {
                mensaje += profesor;
            }
        }
        return mensaje;
    }
    
}
