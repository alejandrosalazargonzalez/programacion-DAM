
package es.ies.puerto;
import java.util.Objects;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class Car {
    private String Color;
    private String tipo;


    public Car() {
    }

    public Car(String Color, String tipo) {
        this.Color = Color;
        this.tipo = tipo;
    }

    public String getColor() {
        return this.Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Car)) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(Color, car.Color) && Objects.equals(tipo, car.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Color, tipo);
    }

    @Override
    public String toString() {
        return "{" +
            " Color='" + getColor() + "'" +
            ", tipo='" + getTipo() + "'" +
            "}";
    }
    
}
