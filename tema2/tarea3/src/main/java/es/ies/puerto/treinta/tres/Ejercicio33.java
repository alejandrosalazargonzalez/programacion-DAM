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
public class Ejercicio33 {
    public static void main(String[] args) {
        Computadora computadora = new Computadora(5);
        computadora.agregarcomponente(new Componente("RAM", 5));
        computadora.agregarcomponente(new  Componente("Memoria", 4));
        computadora.agregarcomponente(new Componente("Placa Madre",3));
        computadora.agregarcomponente(new Componente("Grafica", 2));
        computadora.agregarcomponente(new Componente("Procesador", 1));

        System.out.println(computadora);

        computadora.eliminarcomponentes(new Componente("tostadora", 2));

        System.out.println(computadora);
    }
}
