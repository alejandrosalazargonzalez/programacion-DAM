
package es.ies.puerto;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio1 {
    
    /**
     * Calcula la diferencia exacta entre dos fechas
     * @param fechaInicio del calculo
     * @param fechaFin del calculo
     * @return LocalDateTime
     */
    public static LocalDateTime calcularDiferenciaFechas(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        if (fechaFin == null || fechaInicio == null || fechaFin.isAfter(fechaInicio)) {
            return null;
        }

        return null;
    }
}
