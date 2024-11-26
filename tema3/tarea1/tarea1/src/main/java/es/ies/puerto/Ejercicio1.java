package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;
/**
 * Métodos a utilizar: add
 * 
 *   Crea un ArrayList<String> vacío.
 *   Añade cinco nombres al ArrayList usando el método add.
 *   Imprime la lista completa para verificar los elementos añadidos.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Francisco");
        nombres.add("Nicolas");
        nombres.add("Alexander");
        nombres.add("Santiago");
        nombres.add("Giancarlo");

        System.out.println(nombres);

    }
}