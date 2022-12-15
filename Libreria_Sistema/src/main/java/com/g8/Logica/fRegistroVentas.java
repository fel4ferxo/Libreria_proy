/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g8.Logica;

/**
 *
 * @author Fernando Reinoso Revilla
 */

import com.g8.Datos.vRegistroVentas;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class fRegistroVentas {
    private vConexion mysql = new vConexion ();
    private Connection cn = mysql.conectar();
    private String sSQL = "";    
    
    public DefaultTableModel mostrar(String buscar)
    {
    DefaultTableModel modelo;
    String [] titulos = {"codigo_r","codigo","codigo_v","precio_venta","tipo_entrega","modo_pago","info_extra"};
    String [] registro = new String [8];
    
    modelo=new DefaultTableModel(null,titulos);
      
    sSQL="select * from vregistroventas where codigo like '%"+buscar+"%' order by codigo_r";
    try{
    //Declaro variable de tipo Statement 
    Statement st= (Statement) cn.createStatement();
    //crear variable tipo resultset ejecuta la consulta de arriba
    ResultSet rs=st.executeQuery(sSQL);
    while(rs.next())
    {
       registro [0]=rs.getString("codigo_r");
       registro [1]=rs.getString("codigo");
       registro [2]=rs.getString("codigo_v");
       registro [3]=rs.getString("precio_venta");
       registro [4]=rs.getString("tipo_entrega");
       registro [5]=rs.getString("modo_pago");
       registro [6]=rs.getString("info_extra");
       modelo.addRow(registro);
    }
    return modelo;
    }catch(Exception e){
    JOptionPane.showConfirmDialog(null, e);
    return null;
    }
    }
    public boolean insertar (vRegistroVentas dts){
       sSQL="insert into vregistroventas (codigo,codigo_v,precio_venta,tipo_entrega,modo_pago,info_extra)" + "values (?,?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getCodigo());
           pst.setString(2, dts.getCodigo_v());
           pst.setDouble(3, dts.getPrecio_venta());
           pst.setString(4, dts.getTipo_entrega());
           pst.setString(5, dts.getModo_pago());
           pst.setString(6, dts.getInfo_extra());
           
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
