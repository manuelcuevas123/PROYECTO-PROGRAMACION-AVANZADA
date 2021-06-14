package Paquete1;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConectaBD {
    private Connection connection = null;
    
    public final Connection conect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            String server = "jdbc:mysql://127.0.0.1:3306/progra?zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false&useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String pass = "Luisuriel";
            
            connection = DriverManager.getConnection(server, user, pass);
            
            //JOptionPane.showMessageDialog(null, "Conexion Correcta");
            
            return connection;
        }catch(HeadlessException | ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Conexion Fallida");
        }
        return null;
    }
}
