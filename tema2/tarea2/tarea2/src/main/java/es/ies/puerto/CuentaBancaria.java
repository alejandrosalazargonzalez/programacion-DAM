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
public class CuentaBancaria {
    
    String titular;
    float saldo;

    /**
     * Constructor vacio
     */
    public CuentaBancaria() {
    }

    /**
     * Constructor con el titular de la cuenta
     * @param titular de la cuenta
     */
    public CuentaBancaria(String titular) {
        this.titular = titular;
    }
    
    /**
     * Constructor con el titular y el saldo de la cuenta
     * @param titular de la cuenta
     * @param saldo de la cuenta
    */
    public CuentaBancaria(String titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Setters y Getters
    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * metodo que incrementa la cantidad a introducir en el saldo
     * @param ingreso
     */
    public void ingresar(float ingreso)
    {
        if (ingreso > 0.0f)
        {
            setSaldo( getSaldo() + ingreso );
        }
    }

    /**
     * metodo que retira una cantidad de a introducir de dinero del saldo
     * @param retiro
     */
    public void retirar( float retiro)
    {
        if (retiro > 0.0f)
        {
            setSaldo( getSaldo() - retiro );
        }
    }

    /**
     * Metodo que transfiere el dinero de una cuenta a otra
     * @param cuentaObejtivo
     * @param transferencia
     */
    public void transferir( CuentaBancaria cuentaObejtivo, float transferencia)
    {
        if (transferencia > 0)
        {
            if (transferencia < getSaldo())
            {
                cuentaObejtivo.ingresar(transferencia);
                retirar(transferencia);
            }
        } else
        {
            transferenciaError();
        }
    }

    /**
     * Metodo que imprime un mensage de error
     */
    public void transferenciaError()
    {
        System.out.println("No puedes transferir esa cantidad de dinero");
    }

    /**
     * Metodo que devuelve los valores
     */
    @Override
    public String toString() {
        return "{" +
            " titular='" + getTitular() + "'" +
            ", saldo='" + getSaldo() + "'" +
            "}";
    }

}
