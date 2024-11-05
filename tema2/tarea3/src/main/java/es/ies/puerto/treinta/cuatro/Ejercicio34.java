package es.ies.puerto.treinta.cuatro;

public class Ejercicio34 {
    public static void main(String[] args) {
        Menu menu = new Menu(3);

        menu.agregarPlato(new Plato("espaguetis", 12));
        menu.agregarPlato(new Plato("pizza",10));
        menu.agregarPlato(new Plato("plato super especial de la casa", 20));

        System.out.println( menu );

        menu.eliminarPlatos(new Plato("plato super especial de la casa", 100000000));

        System.out.println( menu );

    }
}
