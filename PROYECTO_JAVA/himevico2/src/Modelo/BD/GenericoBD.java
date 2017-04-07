/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.BD;

import Vistas.login;
import Vistas.panelTipo;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Iker
 */
public class GenericoBD {
     private static Connection con;
    
        
    public static Connection CONECTAR() throws Exception{ 
         
            Class.forName("oracle.jdbc.driver.OracleDriver");
         
          
    con =   DriverManager.getConnection("jdbc:oracle:thin:@10.10.10.9:1521:db12102","proyectofinal", "proyectofinal");
    if(con.isValid(1)==true)JOptionPane.showMessageDialog(null, "cenctado");
    return con;
    }
    
    
    public static void cerrarBD() throws Exception{    
            con.close();
    }

   
}