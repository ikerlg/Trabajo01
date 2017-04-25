/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.BD;

import UML.Centro;
import UML.Viaje;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Iker
 */
public class ViajeBD {
     private static PreparedStatement Psentencia;
    private static String plantilla;
    private static Statement sentencia;
    private static ResultSet resultado;
     public static void altaV(Viaje V) throws Exception{
        try{ 
           
            plantilla = "INSERT INTO Viaje(albaran,horaInicio,horaFin) VALUES (?,?,?)";
            Psentencia= GenericoBD.CONECTAR().prepareStatement(plantilla);
           
            Psentencia.setString(1,V.getAlbaran());
            Psentencia.setDate(2,V.getHoraInicio());
            Psentencia.setDate(3,V.getHoraFin());
            
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
