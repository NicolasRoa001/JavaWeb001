package daos;
import clases.DetalleTrabajador;
import clases.TrabajadorDescuento;
import clases.TrabajadorPorcentaje;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class TrabajadorDao {
    
    public ArrayList<TrabajadorDescuento> descuentosLegales(String run1,String run2,String run3){
        ArrayList<TrabajadorDescuento> datos = new ArrayList();
        ResultSet res;
        try {
            Conexion db = new Conexion();
            Connection cnn = db.conectar();
            String consulta = "SELECT t.nombre,t.apellido1,t.apellido2,t.run,s.sueldo,"
                    + "ROUND(s.sueldo * 0.1049,0) AS afp,ROUND(s.sueldo * 0.07,0) AS fonasa "
                    + "FROM trabajadores t "
                    + "INNER JOIN sueldos s ON t.trabajador_id = s.trabajador_id "
                    + "WHERE run IN(?,?,?) "
                    + "ORDER BY t.nombre ASC";
            PreparedStatement ps = cnn.prepareStatement(consulta);
            ps.setString(1, run1);
            ps.setString(2, run2);
            ps.setString(3, run3);
            res = ps.executeQuery();
            while(res.next()){
            TrabajadorDescuento td = new TrabajadorDescuento(res.getString("t.nombre"),
                res.getString("t.apellido1"),
                res.getString("t.apellido2"),
                res.getString("t.run"),
                res.getInt("s.sueldo"),
                res.getInt("afp"),
                res.getInt("fonasa")
                );
                
                datos.add(td);
            }
        } catch (SQLException e) {
        }
        return datos;
    }
     public ArrayList<TrabajadorPorcentaje> DescuentosGastos(){
     ResultSet res;
     ArrayList<TrabajadorPorcentaje> datos = new ArrayList();
       
        try {
            Conexion db = new Conexion();
            Connection cnn = db.conectar();
            String consulta = "SELECT t.nombre,t.apellido1,t.apellido2,t.run,t.tipo_contrato,s.sueldo,"
                    + "ROUND(s.sueldo * 0.2,0) AS ahorro,ROUND(s.sueldo * 0.3,0) AS compras,"
                    + "ROUND(s.sueldo * 0.1,0) AS vacaciones,ROUND(s.sueldo * 0.4,0) AS otros "
                    + "FROM trabajadores t "
                    + "INNER JOIN sueldos s ON t.trabajador_id = s.trabajador_id "
                    + "ORDER BY t.apellido1 DESC";
            PreparedStatement ps = cnn.prepareStatement(consulta);
            res = ps.executeQuery();
            while(res.next()){
                TrabajadorPorcentaje tp = new TrabajadorPorcentaje(
                    res.getString("nombre"),
                    res.getString("apellido1"),
                    res.getString("apellido2"),
                    res.getString("run"),
                    res.getString("tipo_contrato"),
                    res.getInt("sueldo"),
                    res.getInt("ahorro"),  
                    res.getInt("compras"),
                    res.getInt("vacaciones"),    
                    res.getInt("otros")
                );
                datos.add(tp);
            }
        } catch (SQLException e) {
            System.out.println(e.getCause());
        }
        return datos;
    }
     
     public ArrayList<DetalleTrabajador> obtenerDetalle(){
         ArrayList<DetalleTrabajador> datos = new ArrayList();
        ResultSet res;
        try {
    Conexion db = new Conexion();
    Connection cnn = db.conectar();

    String consulta = "SELECT trabajador_id,nombre,run"
                    + " FROM trabajadores"
                    + " ORDER BY nombre ASC";

    PreparedStatement ps = cnn.prepareStatement(consulta);
    res = ps.executeQuery();

    while (res.next()) {
        DetalleTrabajador dt = new DetalleTrabajador(
            res.getInt("trabajador_id"),
            res.getString("nombre"),
            res.getString("run")
        );
           datos.add(dt);
      }

    } catch (SQLException e) {
    System.out.println(e.getCause());
    }
        return datos;
     }
     
     public ArrayList<TrabajadorDescuento> itemsSueldoDao(int id){
         ArrayList<TrabajadorDescuento> datos = new ArrayList();
        ResultSet res;
        try {
    Conexion db = new Conexion();
    Connection cnn = db.conectar();

    String consulta = "SELECT t.nombre,"
                    + "t.apellido1, t.apellido2,t.run,s.sueldo,"
                    + "ROUND(s.sueldo * 0.105) AS afp,"
                    + "ROUND(s.sueldo * 0.07) AS fonasa "
                    + "FROM trabajadores t INNER JOIN sueldos s ON "
                    + "t.trabajador_id = s.trabajador_id AND "
                    + "t.trabajador_id = ? "
                    + "ORDER BY t.apellido1 ASC";

    PreparedStatement ps = cnn.prepareStatement(consulta);
    ps.setInt(1, id);
    res = ps.executeQuery();

    while (res.next()) {
        TrabajadorDescuento dts = new TrabajadorDescuento(
            res.getString("nombre"),
            res.getString("apellido1"),
            res.getString("apellido2"),
            res.getString("run"),
            res.getInt("sueldo"),
            res.getInt("afp"),
            res.getInt("fonasa")        
        );
           datos.add(dts);
      }

    } catch (SQLException e) {
    System.out.println(e.getCause());
    }
        return datos;
     }

}
