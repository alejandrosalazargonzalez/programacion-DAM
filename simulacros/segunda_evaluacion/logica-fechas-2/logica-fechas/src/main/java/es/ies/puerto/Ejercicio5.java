
package es.ies.puerto;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Year;


/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio5 {
    
    /**
     * Calcula la edad de una persona en milisegundos
     * @param fechaNacimiento de la persona
     * @return long
     */
    public static long calcularEdadEnMilisegundos(LocalDateTime fechaNacimiento) {
        if (fechaNacimiento == null) {
            return -1;
        }
        Duration diferencia = Duration.between(fechaNacimiento, LocalDateTime.now());
        return diferencia.toMillis();

    }

    public static void main(String[] args) {
        LocalDateTime fechaNacimiento = LocalDateTime.now();

    }
}
