package es.ies.puerto;

/**
 * Clase banco
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Banco {

        
    float saldo;

    /**
     * constructor vacio
     */
    public Banco()
    {
    }

    /**
     * Constructor con el saldo
     * @param saldo
     */
    public Banco(float saldo)
    {
        this.saldo = saldo;
    }
        
    //Getters y Setters
    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}
