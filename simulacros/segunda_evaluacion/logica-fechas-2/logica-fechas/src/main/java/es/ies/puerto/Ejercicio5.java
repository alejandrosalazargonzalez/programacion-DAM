
package es.ies.puerto;

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
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.compareTo(fechaNacimiento);
        

    }
}
