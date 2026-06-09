
package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/db-trabajadores?"
            + "useSSL=false&serverTimezone=America/Santiago";
    private static final String USER = "root";
    private static final String PASS = "";

    public Connection conectar() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("No se encontró el driver JDBC de Oracle", e);
        }
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
