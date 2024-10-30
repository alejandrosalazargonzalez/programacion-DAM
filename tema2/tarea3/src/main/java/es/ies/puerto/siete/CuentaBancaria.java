package es.ies.puerto.siete;
import java.util.Objects;

/**
 * Define una clase CuentaBancaria con los atributos
 *  saldo, titular, y numero. Implementa métodos 
 * depositar() y retirar(). Utiliza equals() para
 *  comparar dos cuentas por el número de cuenta y
 *  toString() para mostrar el estado actual de la cuenta.
 *  
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class CuentaBancaria {
    private float saldo;
    private String titular;
    private int numero;

    /**
     * Constructor vacio
     */
    public CuentaBancaria() {
    }

    /**
     * Constructor complero
     * @param saldo de la cuenta bancaria
     * @param titular de la cuenta bancaria
     * @param numero de la cuenta bancaria
     */
    public CuentaBancaria(float saldo, String titular, int numero) {
        this.saldo = saldo;
        this.titular = titular;
        this.numero = numero;
    }

    //Getters y Setters
    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Metodo que ingresa dinero en la cuenta
     * @param ingreso
     */
    public void ingresar(float ingreso)
    {
        setSaldo(getSaldo() + ingreso);
    }

    /**
     * Metodo que retira dinero de la cuenta
     * @param retiro
     */
    public void retiro(float retiro)
    {
        setSaldo(getSaldo() - retiro);
    }

    /**
     * Metodo equals
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CuentaBancaria)) {
            return false;
        }
        CuentaBancaria cuentaBancaria = (CuentaBancaria) o;
        return numero == cuentaBancaria.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(saldo, titular, numero);
    }


    @Override
    public String toString() {
        return "{" +
            " saldo='" + getSaldo() + "'" +
            ", titular='" + getTitular() + "'" +
            ", numero='" + getNumero() + "'" +
            "}";
    }
    
}
