
package es.ies.puerto;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class TestEnum {
    public static void main(String[] args) {
        Dia dia = Dia.LUNES;

        switch (dia) {
            case LUNES: case MARTES: case JUEVES: case VIERNES:
                System.out.println("hay programacion");
                break;
            default:
                System.out.println("no hay programacion");
                break;
        }
    }
}