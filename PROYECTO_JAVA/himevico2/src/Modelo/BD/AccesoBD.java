/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.BD;


import UML.Acceso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Iker
 */
public class AccesoBD {
    private static PreparedStatement Psentencia;
    private static String plantilla;
    private static Statement sentencia;
    private static ResultSet resultado;
      public static void altaCentro(Acceso A) throws Exception{
        try{ 
           
            plantilla = "INSERT INTO Acceso(usuario,contrasena,trabajador_dni) VALUES (?,?,?)";
            Psentencia= GenericoBD.CONECTAR().prepareStatement(plantilla);
           
            Psentencia.setString(1,A.getUsuario());
            Psentencia.setString(2,A.getContraseña());
            Psentencia.setString(3,A.getT().getDni());
            
             Psentencia.executeUpdate();
            JOptionPane.showMessageDialog(null, "subido");
            GenericoBD.cerrarBD();
            
          }
          catch(Exception e){
             // La empresa existe, no es un problema
              // El resto de las excepciones si las relanzo
              GenericoBD.cerrarBD();
          }
    }
    
}
