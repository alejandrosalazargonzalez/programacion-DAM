package es.ies.puerto.veinte.cuatro;

public class Ejercicio24 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Julian", "León");
        Zoologico zoologico = new Zoologico("Loro Parque");

        zoologico.addAnimal(animal1);
        System.out.println(zoologico);
    }
}
