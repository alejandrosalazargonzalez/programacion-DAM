package es.ies.puerto;

/**
 * Declara una variable de tipo float para almacenar el valor de pi (3.1416)
 *  y otra para el radio de un círculo.
 *  Calcula el área del círculo usando la fórmula Área = pi * radio * radio.
 * @author alejandrosalazargonzalez
 */
public class Ejercicio8 {
    public static void main(String[] args) {
   
        float pi = 3.1416f;
        float radio = 22f;
        
        float areaCirculo = pi * radio * radio;

        System.out.println("El círculo con radio: " + radio + " tiene un area de: " + areaCirculo);
   
    }
}