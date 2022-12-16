/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g8.Logica;

/**
 *
 * @author Fernando Reinoso Revilla
 */

import com.g8.Interfaces.DAORegistroVentas;
import com.g8.Models.vRegistroVentas;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class fRegistroVentas extends vConexion implements DAORegistroVentas{

    @Override
    public void registrar(vRegistroVentas registro) throws Exception {
        var sSQL="insert into vregistroventas (codigo,codigo_v,precio_venta,tipo_entrega,modo_pago,info_extra)" + "values (?,?,?,?,?,?)";
        
        try {
           
            this.Conectar();
            PreparedStatement pst=this.conexion.prepareStatement(sSQL);
            pst.setInt(1, registro.getCodigo_r());
            pst.setString(2, registro.getCodigo());
            pst.setString(3, registro.getCodigo_v());
            pst.setDouble(4, registro.getPrecio_venta());
            pst.setString(5, registro.getTipo_entrega());
            pst.setString(6, registro.getModo_pago());
            pst.setString(7, registro.getInfo_extra());

            int n=pst.executeUpdate();

        } catch (Exception e){
        
            throw e;
            
        } finally {
        
            this.Cerrar();
            
        }
        
    }

    @Override
    public List<vRegistroVentas> listar() throws Exception {
        List<vRegistroVentas> lista = null;
        var sSQL="select * from vlibro";
    
        try{
        
            this.Conectar();
            PreparedStatement pst=this.conexion.prepareStatement(sSQL);
            new ArrayList();
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            
                vRegistroVentas registro = new vRegistroVentas();
                registro.getCodigo_r();
                registro.getCodigo();
                registro.getCodigo_v();
                registro.getPrecio_venta();
                registro.getTipo_entrega();
                registro.getModo_pago();
                registro.getInfo_extra();
                lista.add(registro);
                
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
