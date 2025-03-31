package es.ies.puerto.config;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class ConfigManager {

    public static class ConfigProperties {

        static String path;

        private static final Properties properties = new Properties();
        static {
           
        }

        /**
         * Metodo estatico para obtener una propiedad
         **/
        public static String getProperty(String key) {
            return properties.getProperty(key);
        }

        /**
         * Funcion para obtener el path
         * @param rutaPath
         */
        public static void setPath(String rutaPath) {
            File file = new File(rutaPath);

            if (!file.exists() || !file.isFile()) {
                System.out.println("Path:"+file.getAbsolutePath());
            }
            path = rutaPath;
            try {
                
                FileInputStream input = new FileInputStream(path);
                InputStreamReader isr = new InputStreamReader(input, "UTF-8");
                properties.load(isr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
