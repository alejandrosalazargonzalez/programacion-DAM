
package es.ies.puerto;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio4 {
    
    /**
     * Obtiene el dia vidiesto en unos años al futuro
     * @param aniosFuturos a revisar
     * @return List<LocalDate>
     */
    public static List<LocalDate> obtenerDiasBisiestos(int aniosFuturos) {
        if (aniosFuturos <= 0 ) {
            throw new IllegalArgumentException("El número de años futuros debe ser mayor a 0.");
        }
        List<LocalDate> febreros = new ArrayList<>();
        int anio = Year.now().getValue();
        for (int i = anio; i < anio + aniosFuturos; i++) {
            LocalDate localDate = LocalDate.of(i, Month.FEBRUARY, Month.FEBRUARY.length(Year.of(i).isLeap()));
            if (localDate.isLeapYear()) {
                febreros.add(localDate);
            }
        }
        return febreros;
    }
}
