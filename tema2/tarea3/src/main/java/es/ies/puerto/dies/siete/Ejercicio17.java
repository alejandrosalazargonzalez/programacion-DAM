package es.ies.puerto.dies.siete;

import es.ies.puerto.cinco.Libro;

public class Ejercicio17 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("titulazo", "yo", 70);
        Libro libro2 = new Libro("recetas", "arguiñano", 70);

        System.out.println(libro1);
        System.out.println(libro2);

        System.out.println("Tienen el mismo número de páginas: " + libro1.equals(libro2));

    }
}
