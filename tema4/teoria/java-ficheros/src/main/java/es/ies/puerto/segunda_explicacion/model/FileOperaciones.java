
package es.ies.puerto.segunda_explicacion.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.segunda_explicacion.Operaciones;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class FileOperaciones implements Operaciones{
    private File file;
    private String fichero = "empleados.txt";

    /**
     * inicializa el fichero
     */
    public FileOperaciones(){
        try {
            URL resource = getClass().getClassLoader().getResource(fichero);
            file = new File(resource.toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    /**
     * convierte a la persona en toString y llama al otro create
     * @param persona a aniadir
     * @return true/false
     */
    public boolean create(Persona persona) {
        Set<Persona> personas = read(file);
        if (personas.contains(persona)) {
            return false;
        }
        return create(persona.toString(), file);
    }

    /**
     * aniade datos al fichero csv
     * @param data a aniadir
     * @param file donde aniadir la data
     * @return true/false
     */
    private boolean create(String data,File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(data);
            writer.newLine();   // Añadir una nueva línea después del registro
            System.out.println("Registro agregado.");
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    /**
     * Actualiza la informacion de una persona
     * @param persona con la informacion actualizada
     * @return true/false
     */
    public boolean update(Persona persona) {
        if (persona == null || persona.getIdentificador().isEmpty() || persona.getIdentificador() == null) {
            return false;
        }
        Set<Persona> personas = read(file);
        if (!personas.contains(persona)) {
            return false;
        }
        for (Persona personaBuscada : personas) {
            if (personaBuscada.equals(persona)) {
                personas.remove(personaBuscada);
                personas.add(persona);
                return updateFile(personas, file);
            }
        }
        System.out.println(personas);
        return true;
    }

    /**
     * Actualiza toda la informacion del fichero
     * lo borra
     * lo crea de nuevo
     * y llama a create para aniadir la informacion
     * @param personas a aniadir
     * @param file que actualizar
     * @return true/false
     */
    private boolean updateFile(Set<Persona> personas, File file){
        try {
            file.delete();
            file.createNewFile();
        } catch (IOException e) {
            return false;
        }
        for(Persona persona : personas) {
            create(persona);
        }
        return true;
    }

    @Override
    /**
     * elimina a una persona del fichero
     * @param persona a eliminar
     * @return true/false
     */
    public boolean delete(Persona persona) {
        if (persona == null || persona.getIdentificador().isEmpty() || persona.getIdentificador() == null) {
            return false;
        }
        Set<Persona> personas = read(file);
        if (!personas.contains(persona)) {
            return false;
        }
        for (Persona personaBuscada : personas) {
            if(personaBuscada.equals(persona)) {
                personas.remove(personaBuscada);
                return updateFile(personas, file);
            }
        }
        return false;
    }

    @Override
    /**
     * Busca a una persona en el fichero
     * @param persona a buscar
     * @return Persona
     */
    public Persona search(Persona persona) {
        Set<Persona> personas = read(file);
        if (personas.contains(persona)) {
            for (Persona personaBuscada : personas) {
                if (personaBuscada.equals(persona)) {
                    return personaBuscada;
                }
            }
        }
        return null;
    }

    @Override
    /**
     * Crea a una persona con un id y la busca
     * @param identificador
     * @return Persona
     */
    public Persona search(String identificador) {
        Persona persona = new Empleado(identificador);
        return search(persona);

    }

    /**
     * Lee el fichero Csv y lo guarda en un Ser
     * @param file a leer
     * @return Ser<Persona>
     */
    public Set<Persona> read(File file) {
        Set<Persona> personas = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] arrayLine = line.split(",");
                Empleado empleado = new Empleado(arrayLine[0],arrayLine[1],Double.parseDouble(arrayLine[2]),arrayLine[3]);
                personas.add(empleado);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personas;
    }   
}
