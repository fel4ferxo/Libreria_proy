/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g8.Logica;

/**
 *
 * @author Fernando Reinoso Revilla
 */

import com.g8.Datos.vComprador;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class fComprador {
    private vConexion mysql = new vConexion ();
    private Connection cn = mysql.conectar();
    private String sSQL = "";    

    public DefaultTableModel mostrar(String buscar)
    {
    DefaultTableModel modelo;
    String [] titulos={"codigo_v","nombre_v","apellidos_v","dni_v","fecha_nacimiento_v"};
    String [] registro=new String [8];
    
    modelo=new DefaultTableModel(null,titulos);
    
    sSQL="select * from vcomprador where nombre_v like '%"+buscar+"%' order by codigo_v";
    try{
        //Declaro variable de tipo Statement 
    Statement st= (Statement) cn.createStatement();
    //crear variable tipo resultset ejecuta la consulta de arriba
    ResultSet rs=st.executeQuery(sSQL);
    
    while(rs.next())
    {
       registro [0]=rs.getString("codigo_v");
       registro [1]=rs.getString("nombre_v");
       registro [2]=rs.getString("apellidos_v");
       registro [3]=rs.getString("dni_v");
       registro [4]=rs.getString("fecha_nacimiento_v");
       modelo.addRow(registro);
    }
    return modelo;
    }catch(Exception e){
        JOptionPane.showConfirmDialog(null, e);
        return null;
    }
    }
    
      public boolean insertar (vComprador dts){
       sSQL="insert into vcomprador (nombre_v,apellidos_v,dni_v,fecha_nacimiento_v)" + "values (?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getNombre_v());
           pst.setString(2, dts.getApellidos_v());
           pst.setString(3, dts.getDni_v());
           pst.setString(4, dts.getFecha_nacimiento_v());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
                                 
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
   
    public boolean editar (vComprador dts){
       sSQL="update vcomprador set nombre_v=?,apellidos_v=?,dni_v=?,fecha_nacimiento_v=?"+
               " where codigo_v=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
         
           pst.setString(1, dts.getNombre_v());
           pst.setString(2, dts.getApellidos_v());
           pst.setString(3, dts.getDni_v());
           pst.setString(4, dts.getFecha_nacimiento_v());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   } 
  
     public boolean eliminar (vComprador dts){
       sSQL="delete from vcomprador where codigo_v=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getCodigo_v());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }

}
