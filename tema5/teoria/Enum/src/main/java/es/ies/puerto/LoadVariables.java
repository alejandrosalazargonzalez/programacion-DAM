
package es.ies.puerto;

import java.io.FileInputStream;
import java.util.Properties;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class LoadVariables {
    static Idioma defaul = Idioma.ESPANIOL;
    static String path = "src/main/resources/idioma-";
    static Properties properties;
    public static void main(String[] args) {
        properties = loadIdioma(defaul);
        System.out.println("Valor de la etiqueta: " + properties.getProperty("etiqueaNombreUsuario"));
    }

    public static Properties loadIdioma(Idioma idioma){
        switch (idioma) {
            case INGLES:
                path=path+"en.properties";
                break;
            case ALEMAN:
                path=path+"de.properties";
                break;
            default:
                path=path+"es.properties";
                break;
        }
        return loadFile(path);
    }

    public static Properties loadFile(String path){
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }
}
