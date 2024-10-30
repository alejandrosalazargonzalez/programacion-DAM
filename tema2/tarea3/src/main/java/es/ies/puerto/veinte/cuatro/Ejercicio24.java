package es.ies.puerto.veinte.cuatro;
/**
 * Crea una clase Zoologico que almacene una lista (array)
 *  (array) de animales (clase Animal) con atributos nombre
 *  y especie. Implementa métodos para agregar, eliminar y
 *  listar animales. Usa toString() para describir el zoológico.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Julian", "León");
        Zoologico zoologico = new Zoologico("Loro Parque");

        zoologico.addAnimal(animal1);
        System.out.println(zoologico);
    }
}
