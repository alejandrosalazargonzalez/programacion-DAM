package es.ies.puerto.segunda_explicacion.model;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FileHashMapOperaciones extends FileOperaciones{
    public FileHashMapOperaciones(){
        super();
    }

    private Map<String,Persona> readMap(File file){
        Map<String,Persona> personasMap = new TreeMap();
        Set<Persona> personas = super.read(file);
        for (Persona persona : personas) {
            personasMap.put(persona.getIdentificador(), persona);
        }
        return personasMap;
    }
}
