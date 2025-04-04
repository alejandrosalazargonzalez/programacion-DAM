package es.ies.puerto.model.abtrastas;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public abstract class Conexion {

    private Connection connection;
    private final String pathBD ="src/main/resources/usuarios.db";

    /**
     * Constructor vacio
     */
    protected Conexion(){
        try {
            if (pathBD == null || pathBD.isEmpty()) {
                throw new SQLException("El fichero es nulo o vacio ");
            }
            File file = new File(pathBD);
            if (!file.exists()) {
                throw new SQLException("No existe la base de datos: " + pathBD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * get del pathBD
     * @return pathBD
     */
    public String getPathBD(){
        return this.pathBD;
    }

    /**
     * Funcion que abre la conexion a la bbdd
     * @return conexion con la bbdd
     */
    public Connection getconnection(){
        try {
            if (connection == null) {
                connection = DriverManager.getConnection("jdbc:sqlite:" + pathBD);
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
    public void cerrar() {
        try {
            if (connection != null || !connection.isClosed()) {
                connection.close();
                connection = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}