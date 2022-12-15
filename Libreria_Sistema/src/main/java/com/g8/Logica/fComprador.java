/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g8.Logica;

/**
 *
 * @author Fernando Reinoso Revilla
 */

import com.g8.Interfaces.DAOComprador;
import com.g8.Models.vComprador;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class fComprador extends vConexion implements DAOComprador{

    @Override
    public void registrar(vComprador comprador) throws Exception {
        
        var sSQL="insert into vcomprador (nombre_v,apellidos_v,dni_v,fecha_nacimiento_v)" + "values (?,?,?,?)";
        try {
            this.Conectar();
            PreparedStatement pst=this.conexion.prepareStatement(sSQL);
            pst.setString(1, comprador.getNombre_v());
            pst.setString(2, comprador.getApellidos_v());
            pst.setString(3, comprador.getDni_v());
            pst.setString(4, comprador.getFecha_nacimiento_v());

            int n=pst.executeUpdate();

        } catch (Exception e){
        
            throw e;
            
        } finally {
        
            this.Cerrar();
            
        }
        
    }
    
}
