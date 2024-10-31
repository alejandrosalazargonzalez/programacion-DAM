package es.ies.puerto.veinte.cinco;

import es.ies.puerto.dies.once.Vehiculo;

/**
 * Crea una clase Concesionaria con una lista (array)
 *  de vehículos (clase Vehiculo). Implementa métodos
 *  para agregar vehículos, listar todos los vehículos
 *  y usar toString() para mostrar detalles.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Concesionaria {
    private Vehiculo[] vehiculos;
    private int numVehiculos;

    /**
     * Constructor vacio
     */
    public Concesionaria() {
    }

    /**
     * Constructor con el numero de vahiculos
     * @param numVehiculos
     */
    public Concesionaria(int numVehiculos) {
        this.vehiculos = new Vehiculo[numVehiculos];
        this.numVehiculos = 0;
    }

    //Getters y Setters
    public Vehiculo[] getVehiculos() {
        return this.vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getNumVehiculos() {
        return this.numVehiculos;
    }

    public void setNumVehiculos(int numVehiculos) {
        this.numVehiculos = numVehiculos;
    }

    /**
     * Metodo que agrega vehiculos al concecionario
     * @param vehiculo
     * @return true/false
     */
    public boolean agregarVehiculo(Vehiculo vehiculo)
    {
        if (numVehiculos >= vehiculos.length) {
            return false;
        }
        vehiculos[this.numVehiculos] = vehiculo;
        this.numVehiculos++;
        return true;
    }


    @Override
    public String toString() {
        String mensaje = "";

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo != null) {
                mensaje += " " + vehiculo;
            }
        }
        return "numVehiculos='" + getNumVehiculos() + "'" + mensaje;
    }

}
