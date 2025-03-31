package es.ies.puerto.model;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author nexphernandez
 * @version 1.0.0
 */

public class OperacionesFile {
    final String pathCsv = "src/main/resources/usuarios.csv";
    final String pathXml = "src/main/resources/usuarios.xml";
    final String pathJson = "src/main/resources/usuarios.json";
    File csvFile;
    File xmlFile;
    File jsonFile;
    ObjectMapper objectMapper;

    /**
     * Cosntructor vacio
     */
    public OperacionesFile() {
        try {
            csvFile = new File(pathCsv);
            xmlFile = new File(pathXml);
            jsonFile = new File(pathJson);
            if (!csvFile.exists()) {
                csvFile.createNewFile();
            }
            if (!xmlFile.exists()) {
                xmlFile.createNewFile();
            }
            if (!jsonFile.exists()) {
                jsonFile.createNewFile();
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        objectMapper = new ObjectMapper();
    }

    /**
     * Funcion  ue aniade un usuario a los archivos
     * @param nombreUsuario a aniadir
     * @param password a aniadir
     * @param nombre a aniadir
     * @param email a aniadir
     * @return true/false
     */
    public boolean add(String nombreUsuario, String password,String nombre,String email) {
        UsuarioEntity usuario = new UsuarioEntity(email, nombreUsuario, password );

        return true;
    }
    /**
     * Funcion que pasa los datos de un archivo json a set
     * @return set con la informacion del archivo/ set vacio
     */
    public Set<UsuarioEntity> jsonToSet() {
        try {
            return objectMapper.readValue(jsonFile, new TypeReference<Set<UsuarioEntity>>() {
            });
        } catch (Exception e) {
            return new HashSet<>();
        }
    }
    /**
     * Funcion que busca un usuaruio por su nombre de usuario y contrasenia
     * @param nombreUsuario a buscar
     * @return usuario bucado/null
     */
    public UsuarioEntity findUsuario(String nombreUsuario, String contrasenia){
        for (UsuarioEntity usuarioModelBuscar : usuarioModels) {
            if (usuarioModelBuscar.getNombreUsuario().equals(nombreUsuario) && usuarioModelBuscar.getPassword().equals(contrasenia)) {
                return usuarioModelBuscar;
            }
        }
        return null;
    }

    /**
     * Funcion que verifica si existe el emai asi en los ficheros
     * @param email a verificar
     * @return true/false
     */
    public boolean verificarEmail(String email){
        for (UsuarioEntity usuarioModelBuscar : usuarioModels) {
            if (usuarioModelBuscar.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Funcion que verifica si existe el usuario en los ficheros
     * @param nombreUsuario a verificar
     * @return true/false
     */
    public boolean verificarUsuario(String nombreUsuario){
        for (UsuarioEntity usuarioModelBuscar : usuarioModels) {
            if (usuarioModelBuscar.getNombreUsuario().equals(nombreUsuario)) {
                return true;
            }
        }
        return false;
    }
}
