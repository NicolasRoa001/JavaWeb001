package config;

import java.sql.SQLException;

public class NewMain {
    public static void main(String[] args) throws SQLException {
        Conexion cn = new Conexion();
        System.out.println(cn.conectar());
    }
    
}
