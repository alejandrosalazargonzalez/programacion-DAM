package es.ies.puerto.segunda_explicacion;

import es.ies.puerto.segunda_explicacion.model.Persona;

public interface Operaciones {
    public boolean create(Persona persona);
    public boolean update(Persona persona);
    public boolean delete(Persona persona);
    public Persona search(Persona persona);
    public Persona search(String identificador);
}
