package es.ies.puerto.herencia;

public interface Crud {
    public boolean add(Persona persona);
    public boolean read(Persona persona);
    public boolean update(Persona persona);
    public boolean delete(Persona persona);
}
