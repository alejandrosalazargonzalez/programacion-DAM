package es.ies.puerto.diez.once;
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
    private String matricula;

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

    /**
     * Constructor solo con la matricula
     * @param matricula
     */
    public Vehiculo(String matricula)
    {
        this.matricula = matricula;
    }

    public Vehiculo(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
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

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Vehiculo)) {
            return false;
        }
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(matricula, vehiculo.matricula);
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
            ", matricula='" + matricula + "'" +
            "}";
    }

}
