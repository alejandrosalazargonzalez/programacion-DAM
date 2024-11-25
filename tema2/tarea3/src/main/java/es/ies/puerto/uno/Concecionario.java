package es.ies.puerto.uno;

import java.util.ArrayList;
import java.util.List;

import es.ies.puerto.diez.once.Vehiculo;

/**
 * para herecias
 */
public class Concecionario {
    private String nombre;
    private List<Vehiculo> vehiculos;

    /**
     * Constructor vacio
     */
    public Concecionario()
    {
        vehiculos = new ArrayList<>();
        // Antes habria sido vehiculo[10]
    }

    /**
     * Constructor con el nombre
     * @param nombre
     */
    public Concecionario(String nombre)
    {
        this.nombre = nombre;
        vehiculos = new ArrayList<>();
    }

    /**
     * metodo que agrega vehiculos al concecionario
     * @param vehiculo
     * @return true/false
     */
    public boolean agregar(Vehiculo vehiculo)
    {
/**
 *      if (vehiculo == null)
        {
            return false;
        }
        if (vehiculos.contains(vehiculo))
        {
            return false;
        } 
        */
        if (obtener(vehiculo) != null)
        {
            return false;
        }
        return vehiculos.add(vehiculo);
    }

    /**
     * metodo que elimina el ultimo vehiculo
     * @return
     */
    public boolean eliminar()
    {
        vehiculos.remove(vehiculos.size() - 1);
        return true;
    }

    /**
     * mertodo que elimina un vehiculo concreto
     * @param vehiculo
     * @return
     */
    public boolean eliminar(Vehiculo vehiculo)
    {
        if(vehiculo == null)
        {
            return false;
        }
        vehiculos.remove(vehiculo);
        return true;
    }

    /**
     * obtener un vehiculo 
     * @param vehiculo
     * @return
     */
    public Vehiculo obtener(Vehiculo vehiculo)
    {
        if (vehiculo == null)
        {
            return null;
        }
        int posicion = vehiculos.indexOf(vehiculo);
        return vehiculos.get(posicion);
    }

    /**
     * obtiene un vehiculo por su matricula
     * @param matricula
     * @return
     */
    public Vehiculo obtener(String matricula)
    {
    /**
     *     for (Vehiculo vehiculo : vehiculos) {
     *      if (vehiculo.getMatricula().equals(matricula))
     *      {   
     *          return vehiculo;
     *      }
     *  }
     *  return null;
    */

        Vehiculo vehiculoBuscar = new Vehiculo(matricula);
        return obtener(vehiculoBuscar);
    }

    /**
     * Actualiza un vehiculo con nuevos datos
     * @param vehiculoActualizar
     * @return
     */
    public boolean actualizar(Vehiculo vehiculoActualizar)
    {
        if (vehiculoActualizar == null)
        {
            return false;
        }
        int posicion = vehiculos.indexOf(vehiculoActualizar);
        if (posicion < 0) //si indexOf retorna -1 (no ha encontrado nada)
        {
            return false;
        }
        vehiculos.set(posicion,vehiculoActualizar);
        return false;
    }

    @Override
    public String toString()
    {
        return "{ nombre " + nombre + " vehiculos: " + vehiculos + "}";
    }
}
