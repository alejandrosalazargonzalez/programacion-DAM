
package es.ies.puerto;

import java.time.LocalDate;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio10 {
    /**
     * calcula los dias que hay entre dos fechas
     * @param fecha1 primera fecha introducida
     * @param fecha2 segunda fecha introducida
     * @return long
     */
    public static long calcularDiferenciaEnDias(LocalDate fecha1, LocalDate fecha2) {
        if (fecha1 == null || fecha2 == null) {
            return -1;
        }
        return fecha2.compareTo(fecha1);
    }
}
