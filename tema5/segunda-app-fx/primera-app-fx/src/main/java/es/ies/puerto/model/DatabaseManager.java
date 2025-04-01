package es.ies.puerto.model;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class DatabaseManager {

    private String databasePath;
    private File file;
    private Connection connection;

    /**
     * Constructor general.
     * 
     * @throws SQLException error controlado.
     */
    public DatabaseManager() throws SQLException {
        databasePath = "src/main/resources/usuarios.db";
        file = new File(databasePath);
        if (!file.exists()) {
            throw new SQLException("No existe la base de datos: " + databasePath);
        }
    }

    public String getRutaArchivoBD() {
        return this.databasePath;
    }

    /**
     * Abre la conexion a la base de datos.
     * 
     * @return retorna la conexion a la base de datos.
     */
    public Connection conectar() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection("jdbc:sqlite:" + databasePath);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.connection;
    }

    /**
     * Funcion que cierra la conexion de bbdd
     * @throws SQLException
     */
    public void cerrar() throws SQLException {
        if (connection != null || !connection.isClosed()) {
        connection.close();
        connection = null;
        }
    }
}