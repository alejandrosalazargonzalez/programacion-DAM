
package es.ies.puerto.cuarenta.uno;

import es.ies.puerto.seis.Estudiante;

/**
 * Crea una clase Colegio que almacene una lista
 *  (array) de estudiantes. Implementa métodos
 *  para agregar y eliminar estudiantes, y usa
 *  toString() para mostrar los detalles del colegio.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Colegio {
    private Estudiante[] estudiantes;
    private int tamanioLista;

    /**
     * Constructor vacio
     */
    public Colegio() {
    }

    /**
     * Constructor completo
     * @param tamanioLista
     */
    public Colegio( int tamanioLista) {
        this.estudiantes = new Estudiante[tamanioLista];
        this.tamanioLista = tamanioLista;
    }

    //Getters y Setters
    public Estudiante[] getEstudiantees() {
        return this.estudiantes;
    }

    public void setEstudiantees(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int getTamanioLista() {
        return this.tamanioLista;
    }

    public void setTamanioLista(int tamanioLista) {
        this.tamanioLista = tamanioLista;
    }

    /**
     * Metodo que agrega un estudiante a la lista
     * @param estudiante
     */
    public void agregarEstudiante(Estudiante estudiante)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (estudiantes[i] == null )
            {
                estudiantes[i] = estudiante;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina una estudiante de la lista
     */
    public void eliminarEstudiante(Estudiante estudiante)
    {
        int i = estudiantes.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( estudiantes[i].equals(estudiante) )
            {
                estudiantes[i] = null;
                buscar = false;
            }
            i--;
        }
    }

    @Override
    public String toString() {
        String mensaje = "estudiantes: ";
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null) {
                mensaje += estudiante;
            }
        }
        return mensaje;
    }
}
