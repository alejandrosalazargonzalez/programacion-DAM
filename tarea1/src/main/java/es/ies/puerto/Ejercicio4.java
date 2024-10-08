package es.ies.puerto;

/**
 * Declara una variable de tipo boolean que indique si una persona
 *  es mayor de edad (true o false). 
 * Asigna un valor y muéstralo por pantalla.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio4 {
    static final int MAYOR_EDAD = 18;
    public static void main(String[] args) {

        boolean esmayor = true;
        int edad = 20;

        System.out.println("¿Eres mayor de edad?");
        
        if (edad < MAYOR_EDAD) 
        {
            esmayor = false;   
            
            System.out.println(esmayor + " Eres menor de edad tienes " + edad + " años.");
        } else
        {
            System.out.println(esmayor + "Eres mayor de edad tienes " + edad + " años.");
        }


    }
}