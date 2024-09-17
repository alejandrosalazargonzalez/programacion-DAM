package es.ies.puerto;

/**
 * Declara dos variables de tipo double para almacenar
 * el precio de dos productos. Calcula la suma y muestra el resultado.
 * @author alejandrosalazargonzales
 * 
 */
public class Ejercicio2 {
    public static void main(String[] args) {

        double dprecio1 = 20.50d;
        double dprecio2 = 269.99d;
        double dsuma = dprecio1 + dprecio2;

        System.out.println( "El precio1 es:" + dprecio1 + ", el precio2 es: " + dprecio2 );
        System.out.println( "La suma de ambos precios es: " + dsuma);

    }
}