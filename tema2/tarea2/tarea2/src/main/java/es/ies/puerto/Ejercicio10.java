package es.ies.puerto;

/**
 * Ejercicio10
 * Crea una clase CuentaBancaria con los atributos
 * titular y saldo. Implementa un método para
 * transferir dinero entre dos cuentas.
 *
 * Ejercicio11
 * Modifica la clase CuentaBancaria para que la
 *  transferencia no pueda realizarse si el saldo
 *  de la cuenta es insuficiente.
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        CuentaBancaria cuentaDePedro = new CuentaBancaria("Pedro", 1500);
        CuentaBancaria cuentaDeLaura = new CuentaBancaria("Laura", 1000);

        cuentaDePedro.transferir(cuentaDeLaura, 500);
        
        System.out.println("Cuenta de Pedro" + cuentaDePedro.toString());
        System.out.println();
        System.out.println("Cuenta de Laura" + cuentaDeLaura.toString());
    }
}
