
package es.file.json;
import java.util.Objects;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class Car {
    private int id;
    private String marca;
    private String modelo;
    private double precio;

    /**
     * constructor vacio
     */
    public Car() {

    }

    /**
     * constructor de busqueda
     * @param id del coche
     */
    public Car(int id){
        this.id = id;
    }

    /**
     * Constructor completo
     * @param id
     * @param marca
     * @param modelo
     * @param precio
     */
    public Car(int id, String marca, String modelo, double precio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }




    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Car)) {
            return false;
        }
        Car car = (Car) o;
        return id == car.id ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }



}
