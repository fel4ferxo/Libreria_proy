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
import javax.swing.JOptionPane;

public class vConexion {
    public String db = "libreria_Ventas";
    public String url = "jdbc:mysql://localhost:3306/" + db;
    public String user = "root";
    public String pass = "";
        //Crearemos un constructor
    public vConexion() {
    }
    //Funcion para conectarme a la BD
    public Connection conectar()
    {
        Connection link=null;
        
        try
        {
        //Cargare el driver de la conexion
            Class.forName("org.gjt.mm.mysql.Driver");
        //Creo un enlace hacia las Base de datos
            link=DriverManager.getConnection(this.url,this.user,this.pass);
        }
        //Clic en el mensaje para decirle que sean excepciones especificas.
        catch(ClassNotFoundException | SQLException e)
        {
            //Mostrando mensaje del posible error que tenga
           JOptionPane.showConfirmDialog(null,e);
        }
        return link;
    }
    
}
