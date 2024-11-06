package es.ies.puerto.cuarenta.dos;

import es.ies.puerto.diez.seis.Fecha;

/**
 * Crea una clase Cine que almacene una lista (array)
 *  de proyecciones (clase Proyeccion, clase con propiedades:
 *  ciudad, hora, y fecha). Implementa métodos para agregar
 *  y eliminar proyecciones, y usa toString() para mostrar
 *  los detalles del cine.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio32 {
    public static void main(String[] args) {
        Cine cine = new Cine(3);
        Fecha fecha = new Fecha(2, 11, 2024);
        cine.agregarProyeccion(new Proyeccion("Santa Cruz", 10, fecha));
        cine.agregarProyeccion(new Proyeccion("Las Palmas", 17, fecha));
        cine.agregarProyeccion(new Proyeccion("Cadiz", 20, fecha));

        System.out.println(cine);

        cine.eliminarProyeccion(new Proyeccion("Santa Cruz", 10, fecha));
        System.out.println(cine);
    }
}
