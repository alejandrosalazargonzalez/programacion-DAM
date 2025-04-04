
package es.ies.puerto.model;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class ConexionModel {
    
    private String rutaArchivoBD;
    private Connection connection;

    /**
     * Constructor vacio
     */
    public ConexionModel() {
    }

    /**
     * constructor con el path del archivo bd
     * 
     * @param unaRutaArchivoBD
     * @throws SQLException
     */
    public ConexionModel(String unaRutaArchivoBD) throws SQLException {
        if (unaRutaArchivoBD == null || unaRutaArchivoBD.isEmpty()) {
            throw new SQLException("el fichero no existe");
        }
        File file = new File(unaRutaArchivoBD);
        if (!file.exists()) {
            throw new SQLException("no existe la bbdd: " + unaRutaArchivoBD);
        }
        rutaArchivoBD = unaRutaArchivoBD;
    }

    public String getRutaArchivoBD() {
        return this.rutaArchivoBD;
    }

    public Connection getConnection() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection("jdb:sqlite:" + rutaArchivoBD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.connection;
    }

    /**
     * abre la connecion con la base de datos
     * 
     * @return Connection
     * @throws SQLException
     */
    public Connection conectar() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection("jdb:sqlite:" + rutaArchivoBD);
        }
        return connection;
    }

    /**
     * cierra la connecion con la base de datos
     * 
     * @throws SQLException
     */
    public void cerrar() throws SQLException {
        if (connection == null) {
            return;
        }
        connection.close();
    }
}
