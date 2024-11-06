package es.ies.puerto.treinta.ocho;

/**
 * Crea una clase Juego que almacene una lista (array)
 *  de jugadores (clase Jugador). Implementa métodos para
 *  agregar y eliminar jugadores, y usar toString() para
 *  mostrar los detalles del juego.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio38 {
    public static void main(String[] args) {
        Juego juego = new Juego(3);
        juego.agregarJugador(new Jugador("Santi", 27));
        juego.agregarJugador(new Jugador("Manuel", 20));
        juego.agregarJugador(new Jugador("Luisa", 30));

        System.out.println(juego);

        juego.eliminarJugador(new Jugador("Santi", 1000));
        System.out.println(juego);
    }
}
