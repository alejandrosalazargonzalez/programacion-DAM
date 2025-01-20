
package es.ies.puerto;

import java.time.LocalDate;
import java.time.Month;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio2 {

    public static int obtenerDiasDelMes(int anio, Month mes) {
        if(anio < 1 || mes == null)
        {
            return -1;
        }
        LocalDate localDate = LocalDate.of(anio, mes.getValue(), 0);
        int numeroMes = localDate.getMonthValue();
        
        switch (numeroMes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if (localDate.isLeapYear()) {
                    return 28;
                }
                return 27;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return -1;
        }
    }
}
