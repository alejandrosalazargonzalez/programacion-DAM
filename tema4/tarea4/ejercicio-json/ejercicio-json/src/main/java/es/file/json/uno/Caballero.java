package es.file.json.uno;

import com.fasterxml.jackson.annotation.*;
import java.time.LocalDate;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Caballero {
    private int id;
    private String nombre;
    private String constelacion;
    private int nivel;
    private String fechaIngreso;

    /**
     * Constructor compledo
     * @param id del caballero
     * @param nombre del caballero
     * @param constelacion del caballero
     * @param nivel del caballero
     * @param fechaIngreso del caballero
     */
    @JsonCreator
    public Caballero(@JsonProperty("id") int id,
                    @JsonProperty("nombre") String nombre,
                    @JsonProperty("constelacion") String constelacion,
                    @JsonProperty("nivel") int nivel,
                    @JsonProperty("fechaIngreso") String fechaIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.constelacion = constelacion;
        this.nivel = nivel;
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Constructor con id de caballero
     * @param id  del caballero
     */
    public Caballero(@JsonProperty("id") int id) {
        this.id = id;
    }
    
    //Getters y Setters
    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getConstelacion() {
        return this.constelacion;
    }

    public int getNivel() {
        return this.nivel;
    }

    public String getFechaIngreso() {
        return this.fechaIngreso;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Caballero)) {
            return false;
        }
        Caballero caballero = (Caballero) o;
        return id == caballero.id ;
    }
}
