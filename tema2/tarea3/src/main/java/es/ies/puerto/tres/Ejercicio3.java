package es.ies.puerto.tres;

/**
 *  Aqui se aplica la clase Coche.
 * 
 *  Define la clase Coche con atributos marca, modelo,
 *  año y velocidad. Incluye métodos acelerar() y
 *  frenar(), que modifiquen la velocidad. Usa getters
 *  y setters para controlar el acceso a los atributos.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Coche coche = new Coche("toyota", "corolla", 1970, 70);
        System.out.println(coche);

        coche.acelerar(20);
        System.out.println(coche);

        coche.frenar(40);
        System.out.println(coche);
    }
}
