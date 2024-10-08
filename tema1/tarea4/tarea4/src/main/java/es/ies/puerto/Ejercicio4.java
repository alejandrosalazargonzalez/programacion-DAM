package es.ies.puerto;
/**
 * Un cazador de tesoros ha recolectado una lista de objetos en el orden en que los encontró.
 *  Escribe un programa que invierta el orden de los objetos en su inventario para mostrar el
 *  último objeto primero.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        String[] inventario = {"Espada", "Escudo", "Poción", "Gema", "Mapa"};
        String[] invertido = new String[5];

        for (int i = 0; i < inventario.length; i++ )
        {
            invertido[inventario.length -1-i] = inventario[i];
        }
        for(int i = 0; i < invertido.length; i++)
        {
            System.out.print(invertido[i] + " ");
        }
        System.out.println();

    }
}