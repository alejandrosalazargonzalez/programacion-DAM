package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: size, get
 *
 *   Usa un bucle for para recorrer el ArrayList.
 *   Imprime cada elemento en una línea diferente accediendo a ellos con el método get.
 *   Realiza el mismo ejercicio utilizando el método toString de listacreada, y compara las diferencias.
 *
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));
        for (int i = 0; i < nombres.size() - 1; i++)
        {
            System.out.println(nombres.get(i));
        }
    }
}