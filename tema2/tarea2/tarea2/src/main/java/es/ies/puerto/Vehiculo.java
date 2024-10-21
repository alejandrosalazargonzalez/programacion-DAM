package es.ies.puerto;

/**
 * Ejercicio 17
 * Crea una clase Vehiculo con los atributos marca, modelo y combustible.
 *  Define un método que permita agregar combustible al vehículo.
 * 
 * @author alejandrosalzargonzalez
 * @version 1.1.0
 */
public class Vehiculo {
    
    private String marca;
    private String modelo;
    private float combustibe;

    /**
     * Constructor vacio
     */

    public Vehiculo() {
    }

    /**
     * Constructor con la marca
     * @param marca del vehiculo
     */
    public Vehiculo(String marca) {
        this.marca = marca;
    }

    /**
     * Constructorcon la marca y el modelo
     * @param marca del vehiculo
     * @param modelo del vehiculo
     */
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Constructor con la marca, el modelo y el combustible del vehiculo
     * @param marca del vehiculo
     * @param modelo del vehiculo
     * @param combustibe del vehiculo
     */
    public Vehiculo(String marca, String modelo, float combustibe) {
        this.marca = marca;
        this.modelo = modelo;
        setCombustibe(combustibe);;
    }

    //Getters y Setters
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCombustibe() {
        return this.combustibe;
    }

    public void setCombustibe(float combustibe) {
        if (0f > combustibe) {
            errorAgregar();
        } else
        {
            this.combustibe = combustibe;
        }
    }

    public void agregarConbustible(float combustibe)
    {
        if (combustibe > 0f) {
            setCombustibe(getCombustibe() + combustibe);
        } else
        {
            errorAgregar();
        }
    }

    public void errorAgregar()
    {
        System.out.println("No puede agregar combustible negativo");
    }
    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", combustibe='" + getCombustibe() + "'" +
            "}";
    }
    


}
