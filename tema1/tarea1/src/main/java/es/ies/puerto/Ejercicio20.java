package es.ies.puerto;

/**
 * Crea un programa que intercambie 
 * los valores de dos variables enteras. 
 * Por ejemplo, si la variable a vale 5 y b vale 10, 
 * después del intercambio a debería valer 10 y b 5.
 * 
 * @author alejandrosalzargonzalez
 */
public class Ejercicio20 {
    public static void main(String[] args) {

        int primerValor = 27;
        int segundoValor = 64;
        int tercerValor;

        System.out.println("El primer valor es: " + primerValor + " y el segundo valor es: " + segundoValor);

        tercerValor = segundoValor;
        segundoValor = primerValor;
        primerValor = tercerValor;

        System.out.println("Ahora el primer valor es " + primerValor + " y el segundo valor es: " + segundoValor );
    }
}