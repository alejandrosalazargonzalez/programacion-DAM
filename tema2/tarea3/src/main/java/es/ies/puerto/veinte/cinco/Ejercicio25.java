package es.ies.puerto.veinte.cinco;

import es.ies.puerto.diez.once.Vehiculo;

/**
 * Crea una clase Concesionaria con una lista (array)
 *  de vehículos (clase Vehiculo). Implementa métodos
 *  para agregar vehículos, listar todos los vehículos
 *  y usar toString() para mostrar detalles.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        Concesionaria concesionario = new Concesionaria(5);
        Vehiculo vehiculo = new Vehiculo("Seat", "Ibiza");
        concesionario.agregarVehiculo(vehiculo);
        System.out.println("Concecionario: " + concesionario);
    }
}
