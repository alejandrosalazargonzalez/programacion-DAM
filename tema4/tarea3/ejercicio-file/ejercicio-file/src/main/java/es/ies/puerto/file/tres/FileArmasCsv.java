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

    List<Arma> armas = new ArrayList<>();
    File file = new File("src/main/resources-backup/tres.csv");

    /**
     * Lee las armas del fichero
     * 
     * @return List<Arma>
     */
    public List<Arma> obtenerArmas() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] arrayLine = line.split(",");
                Arma arma = new Arma(arrayLine[0], arrayLine[1], arrayLine[2], arrayLine[3],
                        Integer.valueOf(arrayLine[4]));
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
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(data);
            writer.newLine();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    /**
     * Aniade un arma al archivo
     * 
     * @param arma
     */
    public void addArma(Arma arma) {
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
