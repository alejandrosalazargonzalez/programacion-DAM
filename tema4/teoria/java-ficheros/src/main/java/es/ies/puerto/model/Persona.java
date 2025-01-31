package es.ies.puerto.model;
import java.util.Objects;

public class Persona {
    String identificador;
    String nombre;
    long sueldo;

    public Persona(){}

    public Persona(String identificador){
        this.identificador = identificador;
    }

    public Persona(String identificador, String nombre, long sueldo){
        this.identificador = identificador;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }


    public String getIdentificador() {
        return this.identificador;
    }

    public String getNombre() {
        return this.nombre;
    }

    public long getSueldo() {
        return this.sueldo;
    }

    @Override
    public String toString() {
        return getIdentificador() +"," + getNombre() + "," + getSueldo();
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
    
}
