
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
            if (resource == null) {
            }
            file = new File(resource.toURI());
        } catch (Exception e) {
            // TODO: handle exception
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    @Override
    public boolean delete(Persona persona) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
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
