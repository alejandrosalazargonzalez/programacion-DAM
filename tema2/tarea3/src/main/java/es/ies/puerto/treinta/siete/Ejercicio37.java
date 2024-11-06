package es.ies.puerto.treinta.siete;

/**
 * Crea una clase Partido con atributos equipoLocal,
 *  equipoVisitante, y resultado. Implementa métodos
 *  para actualizar el resultado y usar toString()
 *  para mostrar los detalles del partido.´
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio37 {
    public static void main(String[] args) {
        Partido partido = new Partido("Betis", "Las Palmas", false);
        System.out.println(partido);

        partido.actualizarResultado();
        System.out.println(partido);
    }
}
