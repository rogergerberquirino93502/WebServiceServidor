package web;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Roger D. Quirino
 */
public class Conexion {
    Connection con;
    public Conexion(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_productos","root","QMN262Fj7kpv");
    } catch(Exception e){
        
    }
    
}
    public Connection getConection(){
    return con;
    
    }
}