
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
    public boolean modificar(vLibro libro) throws Exception {
        var sSQL="update vlibro set nombre_l=?,autor_l=?,aniopub_l=?,volumen_l=?,edicion_l=?,descripcion_l=?,precio_l=?,imagen_link=? "+
               " where codigo=?";
           
       
       try {
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

    @Override
    public boolean eliminar(vLibro libro) throws Exception {
        var sSQL="delete from vlibro where codigo=?";
       
       try {
           
           PreparedStatement pst=this.conexion.prepareStatement(sSQL);
           
           pst.setInt(1, libro.getCodigo());
           
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
  
}
