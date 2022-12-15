
package com.g8.Logica;

/**
 *
 * @author Fernando Reinoso Revilla
 */

import com.g8.Interfaces.DAOLibro;
import com.g8.Models.vLibro;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class fLibro extends vConexion implements DAOLibro {

    @Override
    public void registrar(vLibro libro) throws Exception {
        
        var sSQL="insert into vlibro (nombre_l,autor_l,aniopub_l,volumen_l,edicion_l,descripcion_l,precio_l,imagen_link)" + "values (?,?,?,?,?,?,?,?)";
        try {
            this.Conectar();
            PreparedStatement pst=this.conexion.prepareStatement(sSQL);
            pst.setString(1, libro.getNombre_l());
            pst.setString(2, libro.getAutor_l());
            pst.setString(3, libro.getAniopub_l());
            pst.setString(4, libro.getVolumen_l());
            pst.setString(5, libro.getEdicion_l());
            pst.setString(6, libro.getDescripcion_l());
            pst.setString(7, libro.getPrecio_l());
            pst.setString(8, libro.getImagen_link());
            
            int n=pst.executeUpdate();

        } catch (Exception e){
        
            throw e;
            
        } finally {
        
            this.Cerrar();
            
        }
        
    }

    @Override
    public void modificar(vLibro libro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(vLibro libro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<vLibro> listar() throws Exception {
        List<vLibro> lista = null;
        var sSQL="select * from vlibro";
    
        try{
        
            this.Conectar();
            PreparedStatement pst=this.conexion.prepareStatement(sSQL);
            new ArrayList();
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            
                vLibro book = new vLibro();
                book.getCodigo();
                book.getNombre_l();
                book.getAutor_l();
                book.getAniopub_l();
                book.getVolumen_l();
                book.getEdicion_l();
                book.getDescripcion_l();
                book.getPrecio_l();
                lista.add(book);
                
            }
            rs.close();
            pst.close();
        
        } catch (Exception e){
        
            throw e;
            
        } finally {
        
            this.Cerrar();
            
        }
        return lista;
    
    }
  
    /*
    private vConexion mysql = new vConexion ();
    private Connection cn = mysql.conexion;
    private String sSQL = "";    

    public DefaultTableModel mostrar(String buscar)
    {
    DefaultTableModel modelo;
    String [] titulos={"codigo","nombre_l","autor_l","aniopub_l","volumen_l","edicion_l","descripcion_l","precio_l", "imagen_link"};
    String [] registro=new String [8];
    
    modelo=new DefaultTableModel(null,titulos);
    
    sSQL="select * from vlibro where nombre_l like '%"+buscar+"%' order by codigo";
    try{
        //Declaro variable de tipo Statement 
    Statement st= (Statement) cn.createStatement();
    //crear variable tipo resultset ejecuta la consulta de arriba
    ResultSet rs=st.executeQuery(sSQL);
    
    while(rs.next())
    {
       registro [0]=rs.getString("codigo");
       registro [1]=rs.getString("nombre_l");
       registro [2]=rs.getString("autor_l");
       registro [3]=rs.getString("aniopub_l");
       registro [4]=rs.getString("volumen_l");
       registro [5]=rs.getString("edicion_l");
       registro [6]=rs.getString("descripcion_l");
       registro [7]=rs.getString("precio_l");
       registro [8]=rs.getString("imagen_link");
       modelo.addRow(registro);
    }
    return modelo;
    }catch(Exception e){
        JOptionPane.showConfirmDialog(null, e);
        return null;
    }
    }
    
      public boolean insertar (vLibro dts){
       sSQL="insert into vlibro (codigo,nombre_l,autor_l,aniopub_l,volumen_l,edicion_l,descripcion_l,precio_l,imagen_link)" + "values (?,?,?,?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getNombre_l());
           pst.setString(2, dts.getAutor_l());
           pst.setString(3, dts.getAniopub_l());
           pst.setString(4, dts.getVolumen_l());
           pst.setString(5, dts.getEdicion_l());
           pst.setString(6, dts.getDescripcion_l());
           pst.setString(7, dts.getPrecio_l());
           pst.setString(8, dts.getImagen_link());
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
   
    public boolean editar (vLibro dts){
       sSQL="update vlibro set nombre_l=?,autor_l=?,aniopub_l=?,volumen_l=?,edicion_l=?,descripcion_l=?,precio_l=?,imagen_link=? "+
               " where codigo=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
         
           pst.setString(1, dts.getNombre_l());
           pst.setString(2, dts.getAutor_l());
           pst.setString(3, dts.getAniopub_l());
           pst.setString(4, dts.getVolumen_l());
           pst.setString(5, dts.getEdicion_l());
           pst.setString(6, dts.getDescripcion_l());
           pst.setString(7, dts.getPrecio_l());
           pst.setString(8, dts.getImagen_link());
           
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
  
     public boolean eliminar (vLibro dts){
       sSQL="delete from vlibro where codigo=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getCodigo());
           
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
    */
}
