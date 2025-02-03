package es.ies.puerto.model;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public interface OperacionesInterface {
    public boolean create(Persona persona);
    public boolean update(Persona persona);
    public boolean delete(Persona persona);
    public Persona search(Persona persona);
    public Persona search(String identificador);
}
