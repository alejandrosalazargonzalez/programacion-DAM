package es.ies.puerto.diez.cero;

/**
 * Crea una clase Pila (simulando una estructura de datos LIFO)
 *  con métodos apilar() y desapilar(). Usa un array para
 *  almacenar los datos y sobrescribe toString() para mostrar
 *  el contenido de la pila.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        String[] datos = new String[5];
        Pila pila = new Pila(datos);

        pila.apilar("huevos");
        pila.apilar("leche");
        pila.apilar("nata");
        pila.apilar("crema de queso");
        pila.apilar("harina");

        System.out.println(pila);

        pila.desapilar();
        System.out.println(pila);
    }
}
