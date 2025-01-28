package es.ies.puerto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class TrabajoFicheros {
    public static void main(String[] args) {
        String directorio = "/home/bae2/programacion-DAM/tema4/herencia";
        String nombre = "archivo.txt";
        File archivo = new File(directorio, nombre);
        File carpeta = new File(directorio);

        System.out.println("Es un fichero: " + archivo.isFile());
        System.out.println("Es un fichero: " + carpeta.isFile());
        System.out.println("Path de un fichero " + archivo.getAbsolutePath());
        if (!archivo.exists()) {
            throw new IllegalAccessError();
        }
            File nuevoFichero = new File(directorio+"/nuevo.txt");
            if (!nuevoFichero.exists()) {
                System.out.println("Se ha creado un archivo nuevo");
            }
            System.out.println("El archivo: " + nuevoFichero.getName() + " ya estaba creado");
            //create(nombre, nuevoFichero);
            //System.out.println("Se le ha añadido una linea");
            //read(nuevoFichero);
            //update("2,Juan,3000", "2,Juan,4000", archivo);
            delete("2,Juan,4000", archivo);
            /*
        * // Verifica si el archivo existe
        *if (archivo.exists()) {
        *    System.out.println("El archivo existe.");
        *} else {
        *    System.out.println("El archivo no existe.");
        *}
        */
    }

    /**
     * Añade una linea aun fuchero de texto
     * @param data
     * @param file
     */
    public static void create(String data,File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(data);
            writer.newLine(); // Añadir una nueva línea después del registro
            System.out.println("Registro agregado.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    /**
     * Muestra el contenido del fichero de texto por pantalla
     * @param file
     */
    public static void read(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void update(String oldData, String newData, File file) {
        File tempFile = new File("temp.txt");
    
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
                BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
    
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(oldData)) {
                    writer.write(newData);  // Reemplazar la línea
                } else {
                    writer.write(line);  // Copiar la línea tal cual
                }
                writer.newLine();
            }
    
            // Reemplazar el archivo original con el archivo temporal
            if (file.delete()) {
                tempFile.renameTo(file);
                System.out.println("Archivo actualizado.");
            } else {
                System.out.println("Error al eliminar el archivo original.");
            }
    
        } catch (IOException e) {
            System.out.println("Error al actualizar el archivo: " + e.getMessage());
        }
    }

    public static void delete(String dataToDelete,File file) {
        File tempFile = new File("temp.txt");
    
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
                BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
    
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.equals(dataToDelete)) {  // Excluir la línea a eliminar
                    writer.write(line);
                    writer.newLine();
                }
            }
    
            if (file.delete()) {
                tempFile.renameTo(file);
                System.out.println("Registro eliminado.");
            } else {
                System.out.println("Error al eliminar el archivo original.");
            }
    
        } catch (IOException e) {
            System.out.println("Error al eliminar el registro: " + e.getMessage());
        }
    }

}

