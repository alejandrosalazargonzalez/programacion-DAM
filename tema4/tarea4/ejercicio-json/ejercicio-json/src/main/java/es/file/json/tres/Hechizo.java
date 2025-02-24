package es.file.json.tres;

import com.fasterxml.jackson.annotation.*;
import java.time.LocalDate;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hechizo {
    private int id;
    private String nombre;
    private String tipo;
    private boolean esOscuro;
    private String fechaCreacion;

    @JsonCreator
    public Hechizo(@JsonProperty("id") int id,
                   @JsonProperty("nombre") String nombre,
                   @JsonProperty("tipo") String tipo,
                   @JsonProperty("esOscuro") boolean esOscuro,
                   @JsonProperty("fechaCreacion") String fechaCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.esOscuro = esOscuro;
        this.fechaCreacion = fechaCreacion;
    }

    public Hechizo(@JsonProperty("id") int id) {
        this.id = id;
    }
    

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public boolean getEsOscuro() {
        return this.esOscuro;
    }

    public boolean isEsOscuro() {
        return this.esOscuro;
    }

    public String getFechaCreacion() {
        return this.fechaCreacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Hechizo)) {
            return false;
        }
        Hechizo hechizo = (Hechizo) o;
        return Objects.equals(id, hechizo.id);
    }

}
