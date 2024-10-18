package es.ies.puerto;
/**
 *  Crea un objeto de la clase Coche con marca 
 * "Toyota", modelo "Corolla", y año 2022. 
 * Muestra los atributos del coche (marca, modelo,
 *  año) usando getters.
 *
 * @author alejandrosalzargonzalez
 * @version 1.0.0
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota","Corolla",2022);

        System.out.println(coche.toString());
    }
}
