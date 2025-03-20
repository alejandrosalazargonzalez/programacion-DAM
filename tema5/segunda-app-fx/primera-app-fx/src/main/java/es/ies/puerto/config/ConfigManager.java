package es.ies.puerto.config;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class ConfigManager {
    static String path;

        public static class ConfigProperties{
            private static final Properties properties = new Properties();

            static{
                try {
                    FileInputStream input = new FileInputStream(path);
                    InputStreamReader isr = new InputStreamReader(input,StandardCharsets.UTF_8);
                    properties.load(isr);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        /**
         *  Metodo estatico para obtener una propiedad
         **/
        public static String getProperty(String key) {
            return properties.getProperty(key);
        }

        public static void setPath(String rutaPath) {
            path = rutaPath;
        }
    }
}
