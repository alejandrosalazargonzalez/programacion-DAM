package es.ies.puerto.diez.once;

import es.ies.puerto.uno.Concecionario;

/**
 * Define una clase base Vehiculo con atributos
 *  marca y modelo. Usa toString() para describir
 *  el vehículo.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */

public class Ejercico11 {
/**     
    public static void main(String[] args) {
        
        Vehiculo vehiculo = new Vehiculo("Toyota", "corolla");
        System.out.println(vehiculo);
    }
 */
    static Concecionario renault;
    public static void main(String[] args) {
        renault = new Concecionario("Renault");
        Vehiculo dacia = new Vehiculo("renault","logan", "una");
        Vehiculo dacia2 = new Vehiculo("renault","logan", "otra");

        renault.agregar(dacia);
        renault.agregar(dacia2);
        System.out.println("Soy un concecionario: " + renault);

        renault.eliminar(dacia);
        System.out.println("Soy un concecionario despues de eliminar: " + renault);

        Vehiculo dacia3 = new Vehiculo("renault","clio", "otra");
        renault.actualizar(dacia3);
        System.out.println("Otra vez concecionario pero actualizado:" + renault);

    }
}