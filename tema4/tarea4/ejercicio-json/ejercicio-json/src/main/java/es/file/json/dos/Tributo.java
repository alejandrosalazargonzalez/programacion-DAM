package es.file.json.dos;

import com.fasterxml.jackson.annotation.*;
import java.time.LocalDate;
import java.util.Objects;

public class Tributo {
    private int id;
    private String nombre;
    private int distrito;
    private boolean voluntario;
    private String fechaSeleccion;

    @JsonCreator
    public Tributo(@JsonProperty("id") int id,
                   @JsonProperty("nombre") String nombre,
                   @JsonProperty("distrito") int distrito,
                   @JsonProperty("voluntario") boolean voluntario,
                   @JsonProperty("fechaSeleccion") String fechaSeleccion) {
        this.id = id;
        this.nombre = nombre;
        this.distrito = distrito;
        this.voluntario = voluntario;
        this.fechaSeleccion = fechaSeleccion;
    }

    public Tributo(@JsonProperty("id") int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getDistrito() {
        return this.distrito;
    }

    public boolean getVoluntario() {
        return this.voluntario;
    }

    public boolean isVoluntario() {
        return this.voluntario;
    }

    public String getFechaSeleccion() {
        return this.fechaSeleccion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Tributo)) {
            return false;
        }
        Tributo tributo = (Tributo) o;
        return Objects.equals(id, tributo.id);
    }
}
