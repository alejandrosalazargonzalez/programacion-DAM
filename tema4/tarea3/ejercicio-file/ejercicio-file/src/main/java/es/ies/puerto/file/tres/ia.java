package es.ies.puerto.file.tres;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class ia {
    
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
                    String descripcion = line.substring(line.indexOf("\"") + 1, line.lastIndexOf("\""));
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
         * Añade una línea al fichero
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
         * Añade un arma al archivo
         * 
         * @param arma
         */
        public void addArma(Arma arma) {
            if (arma != null) {
                actualizarFichero(arma.toString());
            }
        }
    
        /**
         * Elimina un arma del archivo
         * 
         * @param arma a eliminar
         */
        public void deleteArma(Arma arma) {
            List<Arma> armas = obtenerArmas();
            if (arma != null) {
                armas.remove(arma);
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    for (Arma arma2 : armas) {
                        writer.write(arma2.toString());
                        writer.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    
        /**
         * Actualiza la información de un arma
         * 
         * @param arma actualizada
         */
        public void updateArma(Arma arma) {
            List<Arma> armas = obtenerArmas();
            int posicion = armas.indexOf(arma);
            if (arma != null && posicion >= 0) {
                armas.set(posicion, arma);
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    for (Arma arma2 : armas) {
                        writer.write(arma2.toString());
                        writer.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}