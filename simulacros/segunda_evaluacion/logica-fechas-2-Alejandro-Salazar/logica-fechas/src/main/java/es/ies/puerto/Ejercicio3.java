
package es.ies.puerto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio3 {
    /**
     * convierte una fecha de una zona horaria a la de otra
     * @param fechaHora fecha y hora original
     * @param zonaOrigen zona original
     * @param zonasDestino lista de zonas de destino
     * @return Map<String, ZonedDateTime> 
     */
    public static Map<String, ZonedDateTime> 
            convertirZonasHorarias(LocalDateTime fechaHora, ZoneId zonaOrigen, List<ZoneId> zonasDestino) {
        if (fechaHora == null || zonaOrigen == null || zonasDestino == null || zonasDestino.isEmpty()) {
            return null;
        }
        Map<String,ZonedDateTime> zonasHorarias = new HashMap<>();

        ZonedDateTime primeraZona = ZonedDateTime.of(fechaHora, zonaOrigen);

        for (int i = 0; i < zonasDestino.size(); i++) {
            ZoneId zona = zonasDestino.get(i);
            ZonedDateTime zonedDateTime = primeraZona.withZoneSameInstant(zona);
            zonasHorarias.put(zona.toString(), zonedDateTime);
        }
        return zonasHorarias;
    }
}
