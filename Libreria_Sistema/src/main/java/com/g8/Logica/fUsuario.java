
package com.g8.Logica;

/**
 *
 * @author Fernando Reinoso Revilla
 */

import com.g8.Interfaces.DAOUsuario;
import com.g8.Models.vUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class fUsuario extends vConexion implements DAOUsuario{

    @Override
    public void registrar(vUsuario usuario) throws Exception {
        var sSQL="insert into vusuario (nombre_u,apellidos_u,dni_u,fecha_nacimiento_u,usuario_u,password_u)" + "values ?,?,?,?,?,?)";
    
        try{
        
            this.Conectar();
            PreparedStatement pst=this.conexion.prepareStatement(sSQL);
            pst.setString(1, usuario.getNombre_u());
            pst.setString(2, usuario.getApellidos_u());
            pst.setString(3, usuario.getDni_u());
            pst.setString(4, usuario.getFecha_nacimiento_u());
            pst.setString(5, usuario.getUsuario_u());
            pst.setString(6, usuario.getPassword_u());
            pst.executeUpdate();
            pst.close();
        
        } catch (Exception e){
        
            throw e;
            
        } finally {
        
            this.Cerrar();
            
        }
    }

    @Override
    public boolean modificar(vUsuario usuario) throws Exception {
        var sSQL="update vlibro set nombre_l=?,autor_l=?,aniopub_l=?,volumen_l=?,edicion_l=?,descripcion_l=?,precio_l=?,imagen_link=? "+
               " where codigo=?";
           
       
       try {
           PreparedStatement pst=this.conexion.prepareStatement(sSQL);
         
           pst.setString(1, usuario.getNombre_u());
           pst.setString(2, usuario.getApellidos_u());
           pst.setString(3, usuario.getDni_u());
           pst.setString(4, usuario.getFecha_nacimiento_u());
           pst.setString(5, usuario.getUsuario_u());
           pst.setString(6, usuario.getPassword_u());
           
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
    public boolean eliminar(vUsuario usuario) throws Exception {
        var sSQL="delete from vusuario where codigo_u=?";
       
       try {
           
           PreparedStatement pst=this.conexion.prepareStatement(sSQL);
           
           pst.setInt(1, usuario.getCodigo_u());
           
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
    public List<vUsuario> listar() throws Exception {        
        List<vUsuario> lista = null;
        var sSQL="select * from vusuario";
    
        try{
        
            this.Conectar();
            PreparedStatement pst=this.conexion.prepareStatement(sSQL);
            new ArrayList();
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            
                vUsuario user = new vUsuario();
                user.getCodigo_u();
                user.getNombre_u();
                user.getApellidos_u();
                user.getDni_u();
                user.getFecha_nacimiento_u();
                user.getUsuario_u();
                user.getPassword_u();
                lista.add(user);
                
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

