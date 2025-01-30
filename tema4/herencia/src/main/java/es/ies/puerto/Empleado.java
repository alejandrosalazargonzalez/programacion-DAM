package es.ies.puerto;

import java.util.Objects;

public class Empleado{
    private String nombre;
    private String id;

    public Empleado() {
    }

    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Empleado)) {
            return false;
        }
        Empleado empleado = (Empleado) o;
        return Objects.equals(nombre, empleado.nombre) && Objects.equals(id, empleado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, id);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", id='" + getId() + "'" +
            "}";
    }

}