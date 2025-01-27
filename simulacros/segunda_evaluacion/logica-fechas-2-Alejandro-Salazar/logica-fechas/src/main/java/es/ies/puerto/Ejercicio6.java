
package es.ies.puerto;

import java.time.LocalDateTime;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio6 {
    
    /**
     * obtiene la proxima fecha donde haya una eclipse segun una lista dada
     * @param eclipses segun la lista
     * @param fechaReferencia para sacar el siguiente eclipse
     * @return LocalDateTime
     */
    public static LocalDateTime obtenerProximoEclipse(List<LocalDateTime> eclipses, LocalDateTime fechaReferencia) {
        if (eclipses == null || eclipses.isEmpty() || fechaReferencia == null) {
            return null;
        }
        for (int i = 0; i < eclipses.size(); i++) {
            if (fechaReferencia.isBefore(eclipses.get(i) )) {
                return eclipses.get(i);
            }
        }
        throw new IllegalArgumentException();   
    }
}
