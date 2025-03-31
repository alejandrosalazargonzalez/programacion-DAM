package es.ies.puerto.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */

public class ConfigManager {
    public static class ConfigProperties {
        static String path;

        /**
         * Constructor vacio
         */
        public ConfigProperties(){
        }

        private static final Properties properties = new Properties();

        /**
         * Metodo estatico para obtener una propiedad
         **/
        public static String getProperty(String key) {
            return properties.getProperty(key);
        }

        public static void setPath(String rutaPath) {
            File file = new File(rutaPath);

            if (!file.exists() || !file.isFile()) {
                System.out.println("Path:"+file.getAbsolutePath());
            }
            path = rutaPath;
            try {

                FileInputStream input = new FileInputStream(path);
                InputStreamReader isr = new InputStreamReader(input, StandardCharsets.UTF_8);
                properties.load(isr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
