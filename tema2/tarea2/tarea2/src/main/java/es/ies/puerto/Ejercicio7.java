package es.ies.puerto;

/**
 *
 * Crea una clase Banco con un atributo privado
 *  saldo. Implementa métodos para depositar y
 *  retirar dinero, y un método getter para
 *  consultar el saldo.
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        
        Banco banco = new Banco(1000);

        banco.ingresar(500);
        banco.retirar(200);
        System.out.println(banco.toString());
    }
}
