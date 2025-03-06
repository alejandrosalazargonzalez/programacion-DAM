
package es.ies.puerto.primera_explicacion.model.fichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.primera_explicacion.model.OperacionesInterface;
import es.ies.puerto.primera_explicacion.model.Persona;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class OperacionesFichero implements OperacionesInterface {

    File fichero;
    String path = "/home/salazar/programacion-DAM/tema4/teoria/java-ficheros/src/main/resources/archivo.txt";
    Set<Persona> personas;
    /**
     * Constructor inicializa el fichero
     */
    public OperacionesFichero(){
        fichero = new File(path);
        if (!fichero.exists() || !fichero.isFile()) {
            throw new IllegalArgumentException("El recurso no es de tipo fichero "+path);
        }
        personas = read(fichero);
    }

    @Override
    /**
     * llama al create pasando la persona a string
     */
    public boolean create(Persona persona) {
        if (persona == null || persona.getIdentificador().isEmpty() || persona.getIdentificador() == null) {
            return false;
        }
        if (personas.contains(persona)) {
            return false;
        }
        return create(persona.toString(), fichero);
        }

    /**
     * Es
     * @param data
     * @param file
     * @return
     */
    private boolean create(String data,File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(data);
            writer.newLine(); // Añadir una nueva línea después del registro
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    private Set<Persona> read(File file) {
        Set <Persona>personas = new HashSet<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] arrayLine = line.split(",");
                Persona persona = new Persona(arrayLine[0],arrayLine[1], Long.valueOf(arrayLine [2]));
                personas.add(persona);
            }
        } catch (IOException e) {
            return new HashSet<>();
        }
        return personas;
    }
    
    @Override
    public boolean update(Persona persona) {
        if (persona == null || persona.getIdentificador().isEmpty() || persona.getIdentificador() == null) {
            return false;
        }
        Set<Persona> personas = read(fichero);
        if (!personas.contains(persona)) {
            return false;
        }
        for (Persona personaBuscada : personas) {
            if (personaBuscada.equals(persona)) {
                personas.remove(personaBuscada);
                personas.add(persona);
                return updateFile(personas, fichero);
            }
        }
        System.out.println(personas);
        return true;
    }

    private boolean updateFile(Set<Persona> personas, File file){
        String path = file.getAbsolutePath();
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
    public boolean delete(Persona persona) {
        if (persona == null || persona.getIdentificador().isEmpty() || persona.getIdentificador() == null) {
            return false;
        }
        Set<Persona> personas = read(fichero);
        if (!personas.contains(persona)) {
            return false;
        }
        for (Persona personaBuscada : personas) {
            if(personaBuscada.equals(persona)) {
                personas.remove(personaBuscada);
                return updateFile(personas, fichero);
            }
        }
        return false;
    }

    @Override
    public Persona search(Persona persona) {
        if (persona == null || persona.getIdentificador().isEmpty() || persona.getIdentificador() == null) {
            return persona;
        }
        Set<Persona> personas = read(fichero);
        for (Persona personaBuscar : personas) {
            if(personaBuscar.equals(persona)) {
                return personaBuscar;
            }
        }
        return persona;
    }

    @Override
    public Persona search(String identificador) {
        if (identificador == null || identificador.isEmpty()) {
            return null;
        }
        Persona persona = new Persona(identificador);
        return search(persona);
    }
}