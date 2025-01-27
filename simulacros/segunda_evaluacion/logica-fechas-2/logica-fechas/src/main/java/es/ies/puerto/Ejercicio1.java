package es.ies.puerto;

import java.time.LocalDateTime;


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
    public static LocalDateTime calcularDiferenciaFechas(LocalDateTime fechaInicio,
                                LocalDateTime fechaFin) {
        if (fechaFin == null || fechaInicio == null) {
            return null;
        }
        if (fechaInicio.isAfter(fechaFin)) {
            throw new IllegalArgumentException("La fecha de inicio no puede ser posterior a la fecha final.");
        }
        return fechaInicio.from(fechaFin);
    }
}
