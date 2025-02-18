/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */

package es.ies.puerto.file.tres;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FileArmasCsv {

    File file = new File("src/main/resources/tres.csv");
    
    /**
     * Lee las armas del fichero
     * 
     * @return List<Arma>
     */
    public List<Arma> obtenerArmas() {
        List<Arma> armas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] arrayLine = line.split(",");
                int longitud = arrayLine.length;
                String[] descripcionArchivo = line.split("\"");
                String descripcion = "\"" + descripcionArchivo[1] + "\"";
                Arma arma = new Arma(arrayLine[0], arrayLine[1], descripcion, arrayLine[longitud-2],
                        Integer.parseInt(arrayLine[longitud-1]));
                armas.add(arma);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return armas;
    }

    /**
     * Busca un arma en el archivo
     * 
     * @param arma buscada
     * @return Arma
     */
    public Arma obtenerArma(Arma arma) {
        if (arma == null) {
            return null;
        }
        List<Arma> armas = obtenerArmas();
        int posicion = armas.indexOf(arma);
        if (posicion < 0) {
            return null;
        }
        return armas.get(posicion);
    }

    /**
     * aniade una linea al fichero
     * 
     * @param data
     * @return true/false
     */
    public boolean actualizarFichero(String data) {

        List<Arma> armas = obtenerArmas();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(data);
            writer.newLine();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    // @Override
    // public boolean update(Persona persona) {
    //     if (persona == null || persona.getIdentificador().isEmpty() || persona.getIdentificador() == null) {
    //         return false;
    //     }
    //     Set<Persona> personas = read(file);
    //     if (!personas.contains(persona)) {
    //         return false;
    //     }
    //     for (Persona personaBuscada : personas) {
    //         if (personaBuscada.equals(persona)) {
    //             personas.remove(personaBuscada);
    //             personas.add(persona);
    //             return updateFile(personas, file);
    //         }
    //     }
    //     System.out.println(personas);
    //     return true;
    // }

    // private boolean updateFile(Set<Persona> personas, File file){
    //     try {
    //         file.delete();
    //         file.createNewFile();
    //     } catch (IOException e) {
    //         return false;
    //     }
    //     for(Persona persona : personas) {
    //         create(persona);
    //     }
    //     return true;
    // }
    /**
     * Aniade un arma al archivo
     * 
     * @param arma
     */
    public void addArma(Arma arma) {
        List<Arma> armas = obtenerArmas();
        if (arma != null) {
            armas.add(arma);
            try {
                file.delete();
                file.createNewFile();
            } catch (IOException e) {
                e.getMessage();
            }
            for (Arma arma2 : armas) {
                actualizarFichero(arma2.toString());
            }
        }
    }

    /**
     * elimina un arma del archivo
     * 
     * @param arma a eliminar
     */
    public void deleteArma(Arma arma) {
        List<Arma> armas = obtenerArmas();
        if (arma != null) {
            int posicion = armas.indexOf(arma);
            if (posicion > 0) {
                armas.remove(arma);
                try {
                    file.delete();
                    file.createNewFile();
                } catch (IOException e) {
                    e.getMessage();
                }
                for (Arma arma2 : armas) {
                    actualizarFichero(arma2.toString());
                }
            }
        }
    }

    /**
     * actualiza la informacion de un arma
     * 
     * @param arma actualizada
     */
    public void updateArma(Arma arma) {
        List<Arma> armas = obtenerArmas();
        if (arma != null) {
            int posicion = armas.indexOf(arma);
            if (posicion > 0) {
                armas.add(posicion, arma);
                try {
                    file.delete();
                    file.createNewFile();
                } catch (IOException e) {
                    e.getMessage();
                }
                for (Arma arma2 : armas) {
                    actualizarFichero(arma2.toString());
                }
            }
        }
    }
}
