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
import java.util.ArrayList;

/**
 *
 * @author LN710Q
 */
public class AlumnoDao {
    private final String  SQL_READALL = "Select * From Alumnos";
    private final String  SQL_ByCartnet = "Select * From Alumnos Where carnet = ?";
    private final String  SQL_Insert = "Insert Into alumnos (carnet,nombres,apellidos,edad,universidad,estado)Values (?,?,?,?,?,?)";
    
    public Alumno readByCartnet(String carnet){
        Conexion con = Conexion.getInstance();
        Alumno a = null;
        PreparedStatement ps;
        ResultSet rs;
        try{
            ps = con.getConnection().prepareStatement(SQL_ByCartnet);
            ps.setString(1, carnet);
            rs = ps.executeQuery();
            
            rs.next();
            a = new Alumno();
            a.setCarnet(rs.getString(1));
            a.setId(rs.getInt(0));
            a.setNombres(rs.getString(2));
            a.setApellidos(rs.getString(3));
            a.setEdad(rs.getInt(4));
            a.setUniversidad(rs.getString(5));
            a.setEstado(rs.getInt(6));
        }catch(Exception e){
       
            
        }finally{
            con.cerrarConexion();
            
        }
        return a;
    }
    
    public ArrayList<Alumno> readAll(){
        Conexion con = Conexion.getInstance();
        ArrayList<Alumno> alumnos = null;
        PreparedStatement ps;
        ResultSet rs;
        try{
            ps = con.getConnection().prepareStatement(SQL_READALL);
            rs = ps.executeQuery();
            
            while(rs.next()){
            Alumno a = new Alumno();
            a.setCarnet(rs.getString(1));
            a.setId(rs.getInt(0));
            a.setNombres(rs.getString(2));
            a.setApellidos(rs.getString(3));
            a.setEdad(rs.getInt(4));
            a.setUniversidad(rs.getString(5));
            a.setEstado(rs.getInt(6));
            alumnos.add(a);
            }
        }catch(Exception e){
       
            
        }finally{
            con.cerrarConexion();
            
        }
        return alumnos;
    }
    
     public void insert(Alumno a){
        Conexion con = Conexion.getInstance();
        PreparedStatement ps;
        ResultSet rs;
        try{
            ps = con.getConnection().prepareStatement(SQL_Insert);
            ps.setString(1, a.getCarnet());
            ps.setString(2, a.getNombres());
            ps.setString(3, a.getApellidos());
            ps.setInt(4, a.getEdad());
            ps.setString(5, a.getUniversidad());
            ps.setInt(5, a.getEstado());
            
            rs = ps.executeQuery();

           
        }catch(Exception e){
       e.printStackTrace();
            
        }finally{
            con.cerrarConexion();
            
        }
       
    }
    
    
    
}
