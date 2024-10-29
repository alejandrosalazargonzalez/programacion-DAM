package es.ies.puerto.dies.seis;

/**
 * Crea una clase Fecha con atributos dia, mes y anio.
 *  Implementa métodos para validar si la fecha es
 *  correcta y para comparar dos fechas con equals().
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha (29,10,2024);

        System.out.println("Fecha: " + fecha1);
        
        Fecha fecha2 = new Fecha(29, 10, 2024);
        System.out.println("¿fecha1 y fecha2 son iguales?" + fecha1.equals(fecha2));
    }
}
