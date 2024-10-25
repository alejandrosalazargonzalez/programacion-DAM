package es.ies.puerto.veinte.tres;

import es.ies.puerto.dos.Productos;

public class Ejercicio23 {

    static Productos[] productos;
    public static void main(String[] args) {
        productos = new Productos[2];
        for (int i = 0; i < productos.length; i++)
        {
            int valor = 1 + i;
            Productos producto = new Productos("id" + valor, "nombre" + valor,10 * valor, 1 * valor);
            productos[i] = producto;
        }
        for (Productos producto : productos) {
            System.out.println(producto);
        }
    }
}
