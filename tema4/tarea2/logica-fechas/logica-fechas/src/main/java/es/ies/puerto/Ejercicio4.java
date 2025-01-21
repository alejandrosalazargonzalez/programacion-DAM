
package es.ies.puerto;

import java.time.LocalDate;
import java.time.Month;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio4 {
    
    /**
     * Funcion que comprueba si una fecha es festivo
     * @param fecha a comprobar
     * @return true/false
     */
    public static boolean esDiaFestivoNacional(LocalDate fecha) {
        if (fecha == null) {
            return false;
        }
        LocalDate navidad = LocalDate.of(fecha.getYear(), Month.DECEMBER, 25);
        LocalDate anioNuevo = LocalDate.of(fecha.getYear(), Month.JANUARY, 1);
        Set<LocalDate> festivos = new HashSet<>();
        festivos.add(navidad);
        festivos.add(anioNuevo);
        return festivos.contains(fecha);
    }
}
