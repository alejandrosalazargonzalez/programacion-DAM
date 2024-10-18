package es.ies.puerto;

/**
 * Ejercicio 8
 * Crea una clase Empleado con los atributos nombre,
 *  puesto y salario. Usa getters y setters para cada
 *  atributo. El salario no puede ser negativo.
 *
 * Ejercicio 9
 * Modifica la clase Empleado para que el setter de
 * puesto no permita valores vacíos o nulos.
 *
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos", "Ingeniero", 30000);

        System.out.println(empleado.toString());
    }
}
