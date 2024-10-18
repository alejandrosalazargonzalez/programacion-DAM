package es.ies.puerto;

/**
 * Clase banco
 * Crea una clase Banco con un atributo privado
 *  saldo. Implementa métodos para depositar y
 *  retirar dinero, y un método getter para
 *  consultar el saldo.
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

    /**
     * metodo que incrementa la cantidad a cantidad a introducir en el saldo
     * @param ingreso
     * @return
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
     * @return
     */
    public void retirar( float retiro)
    {
        if (retiro > 0.0f)
        {
            setSaldo( getSaldo() - retiro );
        }
    }

    /**
     * muestra el saldo
     */
    @Override
    public String toString() {
        return "{" +
            " saldo='" + getSaldo() + "'" +
            "}";
    }

}
