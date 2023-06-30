
package DataBase;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    public String usuario = "UserJava";
    public String pass = "UserJ";
    //Enlace de conexión a nuestra base de datos por el puerto defaul
    public String url = "jdbc:sqlserver://DARKNESS:1433;databaseName=System;";
    public Connection cn = null;
    public Statement st = null;
    
    public Statement Conectar() {
        try {
            Connection cn = DriverManager.getConnection(url, usuario, pass);
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException i) {
            JOptionPane.showMessageDialog(null, i);
        }
        return st;
    }
}
