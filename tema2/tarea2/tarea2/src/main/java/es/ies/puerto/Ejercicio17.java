package es.ies.puerto;

/**
 * Ejercicio 17
 * Crea una clase Vehiculo con los atributos marca, modelo y combustible.
 *  Define un método que permita agregar combustible al vehículo.
 *
 * @author alejandrosalzargonzalez
 * @version 1.1.0
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Honda", "Civic", 40);
        Vehiculo vehiculo2 = new Vehiculo("Ford", "Fiesta", 15);

        System.out.println(vehiculo);
        System.out.println(vehiculo2);
        System.out.println();

        vehiculo.agregarConbustible(20);
        vehiculo.agregarConbustible(-10);
        System.out.println(vehiculo);
        System.out.println(vehiculo2);
    }
}
