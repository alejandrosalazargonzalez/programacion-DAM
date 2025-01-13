package es.ies.puerto.list;

import java.util.ArrayList;
import java.util.List;

import es.ies.puerto.Persona;

public class PersonaList {

    private List<Persona> personas;

    public PersonaList() {
        this.personas = new ArrayList<>();
    }

    public boolean agregar(Persona persona) {
        if (!personas.contains(persona)) {
            return personas.add(persona);
        } else {
            return false;
        }
    }

    public List<Persona> listar() {
        return new ArrayList<>(personas);
    }

    public Persona buscar(String dni) {
        Persona personaBuscar = new Persona(dni);
        int posicion = personas.indexOf(personaBuscar);
        if (posicion < 0) {
            return null;
        } else {
            return personas.get(posicion);
        }
        /**
        return personas.stream()
                .filter(p -> p.getDni().equals(dni))
                .findFirst()
                .orElse(null);
            */     
    }

    public boolean actualizar(String dni, Persona nuevaPersona) {
        /**
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDni().equals(dni)) {
                personas.set(i, nuevaPersona);
                return;
            }
        }
        */
        Persona personaBuscar = new Persona(dni);
        int posicion = personas.indexOf(personaBuscar);
        if (posicion < 0) {
            return false;
        }
        personas.set(posicion, nuevaPersona);
        return true;
    }

    public boolean eliminar(String dni) {
        Persona personaEliminar = new Persona(dni);
        return personas.remove(personaEliminar);
    }
    
}
