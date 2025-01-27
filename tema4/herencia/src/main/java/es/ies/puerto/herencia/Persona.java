package es.ies.puerto.herencia;
import java.util.Objects;

public abstract class Persona {

    private String nombre;
    private String identificador;

    /**
     * Constructor vacio de persona
     */
    public Persona() {
    }

    /**
     * Constructor completo de persona
     * @param nombre
     * @param identificador
     */
    public Persona(String nombre, String identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
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
        return
            " nombre='" + getNombre() + "'" +
            ", identificador='" + getIdentificador() + "'";
    }

}