/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexion.Conexion;
import Modelo.Alumno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author LN710Q
 */
public class AlumnoDao {
    private final String  SQL_READALL = "Select * From Alumnos";
    private final String  SQL_READ = "Select * From Alumnos Where carnet = ?";
    private final String  SQL_Insert = "Insert Into alumnos (carnet,nombres,apellidos,edad,universidad,estado)Values (?,?,?,?,?,?)";
    
    public Alumno readByCartnet(String carnet){
        Conexion con = Conexion.getInstance();
        Alumno a = null;
        PreparedStatement ps;
        ResultSet rs;
        try{
            ps = con.getConnection().prepareStatement(SQL_READ);
            ps.setString(1, carnet);
            
            rs = ps.executeQuery();
            
        }catch(Exception e){
       
            
        }finally{
            
        }
    }
    
    
    
}
