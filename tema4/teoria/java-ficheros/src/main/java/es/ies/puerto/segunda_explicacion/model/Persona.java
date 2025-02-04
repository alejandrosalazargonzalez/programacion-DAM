
package es.ies.puerto.segunda_explicacion.model;
import java.util.Objects;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public abstract class Persona {
    private String identificador;
    private String nombre;

    /**
     * Constructor vacio
     */
    public Persona(){
    }

    /**
     * Constructor con el identificador
     * @param identificador de la persona
     */
    public Persona(String identificador){
        this.identificador = identificador;
    }

    /**
     * Constructor completo
     * @param identificador de la persona
     * @param nombre de la persona
     */
    public Persona(String identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }

    //Getters y Setters
    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(identificador, persona.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador);
    }

    @Override
    public String toString() {
        return "{" +
            " identificador='" + getIdentificador() + "'" +
            ", nombre='" + getNombre() + "'" +
            "}";
    }
    
}
