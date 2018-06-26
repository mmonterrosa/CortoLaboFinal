/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LN710Q
 */
public class Conexion {
    String user, pass, driver, url;
    
    private Connection con;
    public static Conexion instance;

    public Conexion() {
        this.user="root";
        this.pass="";
        this.driver="com.mysql.jdbc.Driver";
        this.url="JDBC:mysql://localhost//alumnos";
        
        try{
            Class.forName(this.driver);
            con = DriverManager.getConnection(url);
        }
        catch (Exception e){
        }
        
    }
    public Connection getConnection(){
        return con;
    }
    
    public synchronized static Conexion getInstance(){
        if(instance==null) instance = new Conexion();
        return instance;
        
    }
    public void cerrarConexion(){
        instance = null;
    }
    
    
     
    
}
