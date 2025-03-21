
package es.ies.puerto;

import java.time.LocalDate;
import java.time.Month;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio2 {

    /**
     * Funcion que devulve los dias que tiene el mes
     * @param anio de la fecha
     * @param mes del anio a sacar dias
     * @return int 
     */
    public static int obtenerDiasDelMes(int anio, Month mes) {
        if(anio < 1 || mes == null)
        {
            return -1;
        }
        LocalDate localDate = LocalDate.of(anio, mes.getValue(), 1);
        return localDate.lengthOfMonth();
        /*
        switch (numeroMes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if (localDate.isLeapYear()) {
                    return 29;
                }
                return 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return -1;
        }
        */
    }
}
