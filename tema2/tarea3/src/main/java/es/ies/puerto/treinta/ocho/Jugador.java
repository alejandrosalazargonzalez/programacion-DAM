package es.ies.puerto.treinta.ocho;
import java.util.Objects;

/**
 * Crea una clase Juego que almacene una lista (array)
 *  de jugadores (clase Jugador). Implementa métodos para
 *  agregar y eliminar jugadores, y usar toString() para
 *  mostrar los detalles del juego.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Jugador {
    private String nombre;
    private int edad;
    
    /**
     * Constructor vacio
     */
    public Jugador() {
    }

    /**
     * Constructor completo
     * @param nombre
     * @param edad
     */
    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Jugador)) {
            return false;
        }
        Jugador jugador = (Jugador) o;
        return Objects.equals(nombre, jugador.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            "}";
    }
    
}
