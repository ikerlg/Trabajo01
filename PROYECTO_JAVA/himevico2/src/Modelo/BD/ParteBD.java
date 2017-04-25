/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.BD;

import UML.Centro;
import UML.Parte;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.Date;
/**
 *
 * @author Iker
 */
public class ParteBD {
    private static PreparedStatement Psentencia;
    private static String plantilla;
    private static Statement sentencia;
    private static ResultSet resultado;
    private static Parte P;
    public static void altaP(Parte P) throws Exception{
        Date fecha=new Date();
        
        try{ 
           
            plantilla = "INSERT INTO PARTE(fecha,kmInicio,kmFinal,finalizado,gasoil,autopista,dietas,otrosGastos,incidencias,horasTrabajadas,Trabajador_dni ,Vehiculo_matricula) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            Psentencia= GenericoBD.CONECTAR().prepareStatement(plantilla);
            Psentencia.setDate(1, (java.sql.Date) fecha);
            Psentencia.setDouble(2,P.getKmInicio());
            Psentencia.setDouble(3,P.getKmFinal());
             Psentencia.setBoolean(4, P.isFinalizado());
              Psentencia.setDouble(5,P.getGasoil() );
               Psentencia.setDouble(6, P.getAutopista());
                Psentencia.setDouble(7, P.getDietas());
                Psentencia.setDouble(8, P.getOtrosGastos());
                 Psentencia.setString(9,P.getIncidencias());
                  Psentencia.setDouble(10,P.getHorasTRabajadas());
                   Psentencia.setString(11,P.gettL().getDni());
                   Psentencia.setString(12,P.getV().getMatricula());
                
                
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
     public static void bajaP(Parte P) throws Exception{
         
            plantilla = "delete from CENTRO where fecha = ?";
           Psentencia = GenericoBD.CONECTAR().prepareStatement(plantilla);
          Psentencia.setDate(1, (java.sql.Date) P.getFecha());
            
         Psentencia.executeUpdate();
            GenericoBD.cerrarBD();
    }
}
