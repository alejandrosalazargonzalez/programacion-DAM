
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

    public FileOperaciones(){
        try {
            URL resource = getClass().getClassLoader().getResource(fichero);
            file = new File(resource.toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public boolean create(Persona persona) {
        Set<Persona> personas = read(file);
        if (personas.contains(persona)) {
            return false;
        }
        return create(persona.toString(), file);
    }

    private boolean create(String data,File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(data);
            writer.newLine(); // Añadir una nueva línea después del registro
            System.out.println("Registro agregado.");
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    @Override
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
    public Persona search(String identificador) {
        Persona persona = new Empleado(identificador);
        return search(persona);

    }
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
