package es.ies.puerto.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ConfigManager {
      public static class ConfigProperties {

        static String path;

        private static final Properties properties = new Properties();
        static {
            // Inicialización por defecto con el idioma español
            setPath("src/main/resources/idioma-es.properties");
        }

        /**
         * Método estático para obtener una propiedad
         */
        public static String getProperty(String key) {
            return properties.getProperty(key);
        }

        public static void setPath(String rutaPath) {
            File file = new File(rutaPath);

            if (!file.exists() || !file.isFile()) {
                System.out.println("Error: Archivo de idioma no encontrado en: " + file.getAbsolutePath());
                return;
            }
            
            path = rutaPath;
            try {
                properties.clear(); // Limpiamos las propiedades anteriores
                FileInputStream input = new FileInputStream(path);
                InputStreamReader isr = new InputStreamReader(input, "UTF-8");
                properties.load(isr);
                isr.close();
                input.close();
            } catch (Exception e) {
                System.err.println("Error cargando el archivo de idioma: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
