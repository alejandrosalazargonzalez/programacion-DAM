
package es.ies.puerto.controller.abstractas;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;


/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public abstract class AbstractController {
    
    private Properties propertiesIdioma;

    /**
     * Setter de propertiesIdioma
     * @param properties
     */
    public void setPropertiesIdioma(Properties properties){
        propertiesIdioma = properties;
    }

    /**
     * getter de properties idioma
     * @return
     */
    public Properties getPropertiesIdioma(){
        return propertiesIdioma;
    }

    /**
     * Cambia el idioma de la aplicacion
     * @param nombreFichero con el idioma a cambiar
     * @param idioma a cambiar
     * @return Properties
     */
    public Properties loadIdioma(String nombreFichero, String idioma) {        
        Properties properties = new Properties();
        if (properties == null || idioma == null) {
            return properties;
        }
        
        String path = "src/main/resources/"+nombreFichero+"-"+idioma+".properties";
        File file = new File(path);
        if (!file.exists() || !file.isFile()) {
            System.out.println("Path: "+file.getAbsolutePath());
            return properties;
        }

        try {
            FileInputStream input = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(input,StandardCharsets.UTF_8);
            properties.load(isr);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return properties;
    }
}
