package es.ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa en Java que permita calcular la velocidad final de un cuerpo en movimiento uniformemente acelerado. Los datos de entrada son:
 *
 *   Velocidad inicial ( v0 ) (en metros por segundo).
 *   Aceleración ( a ) (en metros por segundo al cuadrado).
 *   Tiempo ( t ) (en segundos).
 * 
 * La fórmula de velocidad final es: [ v = v0 + a \cdot t ]
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        double velocidad = scanner.nextDouble();
        double aceleracion = scanner.nextDouble();
        double tiempo = scanner.nextDouble();

        System.out.println("La velocidad final es: " + calcularVelocidad(velocidad, aceleracion, tiempo) + " m/s");

        scanner.close();
    }

    /**
     * Metodo que calcula la velocidad final de un movimiento uniformemente acelerado
     * @param velocidad
     * @param aceleracion
     * @param tiempo
     * @return double
     */
    public static double calcularVelocidad(double velocidad, double aceleracion, double tiempo)
    {
        return velocidad + ( aceleracion * tiempo);
    }
    
}
