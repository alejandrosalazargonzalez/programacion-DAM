package es.ies.puerto.model;
import java.util.Objects;

public class Empleado {
    private String id;
    private String nombre;
    private String fecha;
    private String puesto;

    public Empleado() {
    }
    
    public Empleado(String id) {
        this.id = id;
    }

    public Empleado(String id, String nombre, String fecha, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.puesto = puesto;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Empleado)) {
            return false;
        }
        Empleado empleado = (Empleado) o;
        return Objects.equals(id, empleado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return " id='" + id + "'" +
            ", nombre='" + nombre + "'" +
            ", fecha='" + fecha + "'" +
            ", puesto='" + puesto + "'";
    }
    
}
