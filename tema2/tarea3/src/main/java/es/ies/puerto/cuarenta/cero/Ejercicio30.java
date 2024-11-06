package es.ies.puerto.cuarenta.cero;

/**
 * Crea una clase BibliotecaDigital que almacene
 *  una lista (array) de e-books (clase EBook
 *  (con las propiedades: nombre isbn, y anio)).
 *  Implementa métodos para agregar, eliminar y
 *  buscar libros, y usa toString() para mostrar
 *  los detalles de la biblioteca.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio30 {
    public static void main(String[] args) {
        BibliotecaDigital bibliotecaDigital = new BibliotecaDigital(3);
        bibliotecaDigital.agregarEBook(new EBook("El libro de la vida", 1234567890, 1990));
        bibliotecaDigital.agregarEBook(new EBook("Dormido en el sillon", 987654321, 2000));
        bibliotecaDigital.agregarEBook(new EBook("Tareas", 512374128, 2030));

        System.out.println(bibliotecaDigital);

        bibliotecaDigital.eliminarEBook(new EBook("Tareas", 512374128, 2030));
        System.out.println(bibliotecaDigital);
    }
}
