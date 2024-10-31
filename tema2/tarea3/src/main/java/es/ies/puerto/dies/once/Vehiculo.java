package es.ies.puerto.dies.once;
import java.util.Objects;

/**
 * Define una clase base Vehiculo con atributos
 *  marca y modelo. Usa toString() para describir
 *  el vehículo.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Vehiculo {
    private String marca;
    private String modelo;

    /**
     * Constructor vacio
     */
    public Vehiculo() {
    }

    /**
     * Constructor completo
     * @param marca del coche
     * @param modelo del coche
     */
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //Getters y setters
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


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Vehiculo)) {
            return false;
        }
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(marca, vehiculo.marca) && Objects.equals(modelo, vehiculo.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo);
    }
    

    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            "}";
    }

}
