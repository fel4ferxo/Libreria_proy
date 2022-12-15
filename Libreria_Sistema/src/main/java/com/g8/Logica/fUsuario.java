
package com.g8.Logica;

/**
 *
 * @author Fernando Reinoso Revilla
 */

import com.g8.Datos.vUsuario;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class fUsuario {
    private vConexion mysql = new vConexion ();
    private Connection cn = mysql.conectar();
    private String sSQL = "";    

    public DefaultTableModel mostrar(String buscar)
    {
    DefaultTableModel modelo;
    String [] titulos={"codigo_u","nombre_u","apellidos_u","dni_u","fecha_nacimiento_u","usuario_u","password_u"};
    String [] registro=new String [8];
    
    modelo=new DefaultTableModel(null,titulos);
    
    sSQL="select * from vusuario where nombre like '%"+buscar+"%' order by codigo_u";
    try{
        //Declaro variable de tipo Statement 
    Statement st= (Statement) cn.createStatement();
    //crear variable tipo resultset ejecuta la consulta de arriba
    ResultSet rs=st.executeQuery(sSQL);
    
    while(rs.next())
    {
       registro [0]=rs.getString("codigo_u");
       registro [1]=rs.getString("nombre_u");
       registro [2]=rs.getString("apellidos_u");
       registro [3]=rs.getString("dni_u");
       registro [4]=rs.getString("fecha_nacimiento_u");
       registro [5]=rs.getString("usuario_u");
       registro [6]=rs.getString("password_u");
       modelo.addRow(registro);
    }
    return modelo;
    }catch(Exception e){
        JOptionPane.showConfirmDialog(null, e);
        return null;
    }
    }
    
      public boolean insertar (vUsuario dts){
       sSQL="insert into vusuario (nombre_u,apellidos_u,dni_u,fecha_nacimiento_u,usuario_u,password_u)" + "values (?,?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getNombre_u());
           pst.setString(2, dts.getApellidos_u());
           pst.setString(3, dts.getDni_u());
           pst.setString(4, dts.getFecha_nacimiento_u());
           pst.setString(5, dts.getUsuario_u());
           pst.setString(6, dts.getPassword_u());
           
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
   
    public boolean editar (vUsuario dts){
       sSQL="update vusuario set nombre_u=?,apellidos_u=?,dni_u=?,fecha_nacimiento_u=?,usuario_u=?,password_u=? "+
               " where codigo_u=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
         
           pst.setString(1, dts.getNombre_u());
           pst.setString(2, dts.getApellidos_u());
           pst.setString(3, dts.getDni_u());
           pst.setString(4, dts.getFecha_nacimiento_u());
           pst.setString(5, dts.getUsuario_u());
           pst.setString(6, dts.getPassword_u());
           
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
  
     public boolean eliminar (vUsuario dts){
       sSQL="delete from vusuario where codigo_u=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getCodigo_u());
           
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
     
   public boolean login (vUsuario dts){
       
       PreparedStatement ps = null;
       ResultSet rs = null;
       
       
       String sql = "SELECT codigo_u, usuario_u, password_u FROM vusuario WHERE vusuario = ?";
       
       try{
           ps = cn.prepareStatement(sql);
           ps.setString(1, dts.getUsuario_u());
           rs = ps.executeQuery();
           
           if(rs.next())
           {
               if(dts.getPassword_u().equals(rs.getString(3))){
                   dts.setCodigo_u(rs.getInt(1));
                   dts.setUsuario_u(rs.getString(2));
                   dts.setPassword_u(rs.getString(3));
                   return true;
               }else{
                   return false;
               }
           }
           return false;
       }catch(SQLException ex){
           return false;
       }
   }

 
    
}
