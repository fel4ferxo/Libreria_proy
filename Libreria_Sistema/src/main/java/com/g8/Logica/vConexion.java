/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.vConexion to edit this template
 */
package com.g8.Logica;

/**
 *
 * @author Fernando Reinoso Revilla
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class vConexion {
    
    protected Connection conexion;
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    
    public String db = "libreria_Ventas";
    private final String DB_URL = "jdbc:mysql://localhost:3306/" + db;
    
    public String user = "root";
    public String pass = "";
    
    public void Conectar() throws ClassNotFoundException {
        
        try {
            conexion = DriverManager.getConnection(DB_URL, user, pass);
            Class.forName(JDBC_DRIVER);
        } catch (SQLException ex) {
            Logger.getLogger(vConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void Cerrar() throws SQLException {
        
        if(conexion != null){
            
            if(!conexion.isClosed()) {
            
                conexion.close();
                
            }
        }
        
    }
}
