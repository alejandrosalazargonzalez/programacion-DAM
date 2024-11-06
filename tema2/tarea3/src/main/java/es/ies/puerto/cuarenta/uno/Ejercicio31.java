package es.ies.puerto.cuarenta.uno;

import es.ies.puerto.seis.Estudiante;

/**
 * Crea una clase Colegio que almacene una lista
 *  (array) de estudiantes. Implementa métodos
 *  para agregar y eliminar estudiantes, y usa
 *  toString() para mostrar los detalles del colegio.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio31 {
    public static void main(String[] args) {
        Colegio colegio = new Colegio(3);
        colegio.agregarEstudiante(new Estudiante("Nicolas", "DAM", 10));
        colegio.agregarEstudiante(new Estudiante("Tatiana", "Artes", 10));
        colegio.agregarEstudiante(new Estudiante("Jose", "Historia", 7));

        System.out.println(colegio);

        colegio.eliminarEstudiante(new Estudiante("Jose", "Historia", 7));
    }
}
