/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.BD;

import UML.Acceso;
import UML.Parte;
import UML.Trabajador;
import UML.Centro;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Iker
 */

    public class tAdministradorBD extends Trabajador{
       private static Trabajador t;
       private static Parte p;
       private static Centro c;
          private static Connection con;
    
    private static PreparedStatement Psentencia;
    private static String plantilla;
    private static Statement sentencia;
    private static ResultSet resultado;
   
     
      public static void altaT(Trabajador t) throws Exception{
            //También se puede hacer con herencia
            GenericoBD.CONECTAR();
            plantilla = "INSERT INTO TRABAJADOR (dni,nombre,apellido1,apellido2,calle,mano,categoria,numeroPortal,piso,telEmpresa,telPersonal,salario,fechaNacimiento) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
         Psentencia = GenericoBD.CONECTAR().prepareStatement(plantilla);
           Psentencia.setString(1,t.getDni());
            Psentencia.setString(2,t.getNombre());
           Psentencia.setString(3,t.getApellido1());
         Psentencia.setString(4,t.getApellido2());
           Psentencia.setString(5,t.getCalle());
            Psentencia.setInt(8,t.getNumeroPortal());
           Psentencia.setInt(9,t.getPiso());
           Psentencia.setString(6,t.getMano());
           Psentencia.setInt(10,t.getTelEmpresa());
           Psentencia.setInt(11,t.getTelPersonal());
            Psentencia.setInt(11,t.getTelPersonal());
           Psentencia.setDouble(12,t.getSalario());
           Psentencia.setString(7,t.getCategoria());
        
            java.sql.Date sqlDate =  new java.sql.Date( t.getFechaNacimiento().getTime());
          Psentencia.setDate(13, sqlDate);
     
            plantilla="INSERT INTO ACCESO(USUARIO,CONTRASEÑA,DNI)VALUES(?,?,?)";
             Psentencia = GenericoBD.CONECTAR().prepareStatement(plantilla);
             Psentencia.setString(1,t.getA().getUsuario());
             Psentencia.setString(2,t.getA().getContraseña());
             Psentencia.setString(3, t.getDni());
             //centro arraylist pasarle el T
//          plantilla="INSERT INTO CENTRO()"   
          
          Psentencia.executeUpdate();
            
            // si algo falla en el insert ya saltará la excepción correspondiente.
            GenericoBD.cerrarBD();
    }
    
   
    
    public static java.util.Calendar conversionTimeCalendar(java.sql.Time hora) throws Exception{
        // java.sql.Time -- String -- Calendar
        String strhora = hora.toString();
        java.util.Calendar cal = java.util.Calendar.getInstance();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm:ss");
        cal.setTime(sdf.parse(strhora));  
        return cal;
    }
    
    public static java.time.LocalTime conversionTimeLocalTime(java.sql.Time hora) throws Exception{
        // Time -- String -- Calendar
        String strhora = hora.toString();
        return LocalTime.parse(strhora);
    }
     
    public static void bajaT(String dni) throws Exception{
            GenericoBD.CONECTAR();
            plantilla = "delete from TRABAJADOR where dni = ?";
           Psentencia = GenericoBD.CONECTAR().prepareStatement(plantilla);
          Psentencia.setString(1,t.getDni());
            
         Psentencia.executeUpdate();
            GenericoBD.cerrarBD();
    }

    public static void modificarT(Trabajador t) throws Exception{
            GenericoBD.CONECTAR();
            plantilla = "update TRABAJADOR set  nombre=?,apellido1=?,apellido2=?,calle=?,numeroPortal=?"
                    + "piso=?,mano=?,telEmpresa=?,telPersonal=?,fechaNacimiento=?,salario=?,categoria=?,idCentro=? where dni = ?";
          Psentencia = GenericoBD.CONECTAR().prepareStatement(plantilla);
            

            Psentencia.setString(1,t.getNombre());
           Psentencia.setString(2,t.getApellido1());
         Psentencia.setString(3,t.getApellido2());
           Psentencia.setString(4,t.getCalle());
            Psentencia.setInt(5,t.getNumeroPortal());
           Psentencia.setInt(6,t.getPiso());
           Psentencia.setString(7,t.getMano());
           Psentencia.setInt(8,t.getTelEmpresa());
           Psentencia.setInt(9,t.getTelPersonal());
          
           Psentencia.setDouble(11,t.getSalario());
           Psentencia.setString(12,t.getCategoria());
           Psentencia.setString(13, t.getC().getIdCentro());
            java.sql.Date sqlDate =  new java.sql.Date(t.getFechaNacimiento().getTime());
          Psentencia.setDate(10, sqlDate);
          
          
          Psentencia.executeUpdate();
          
            
       Psentencia.executeUpdate();
           
            GenericoBD.cerrarBD();
    }
    public static void altaCentro(Centro c) throws Exception{
        try{ 
            GenericoBD.CONECTAR();
            plantilla = "INSERT INTO CENTRO VALUES (?,?,?,?,?,?,?,?)";
            Psentencia= GenericoBD.CONECTAR().prepareStatement(plantilla);
             Psentencia.setString(1,c.getIdCentro());
            Psentencia.setString(2,c.getNombre());
            Psentencia.setString(3,c.getCalle());
            Psentencia.setInt(4,c.getNumero());
             Psentencia.setInt(5, c.getCodPostal());
              Psentencia.setString(6,c.getCiudad() );
               Psentencia.setString(7, c.getProvincia());
                Psentencia.setInt(8, c.getTelefono());
             Psentencia.executeUpdate();
            
            GenericoBD.cerrarBD();
            
          }
          catch(Exception e){
             // La empresa existe, no es un problema
              // El resto de las excepciones si las relanzo
              GenericoBD.cerrarBD();
          }
    }
     public static void bajaCentro(String nombre) throws Exception{
            GenericoBD.CONECTAR();
            plantilla = "delete from CENTRO where nombre = ?";
           Psentencia = GenericoBD.CONECTAR().prepareStatement(plantilla);
          Psentencia.setString(1,c.getNombre());
            
         Psentencia.executeUpdate();
            GenericoBD.cerrarBD();
    }
     public static void modificaCentro(Centro c)throws Exception {
     
      try{ 
            GenericoBD.CONECTAR();
            plantilla = "update CENTRO set idcentro=?,nombre=?,calle=?,numero=?,CodPostal=?,ciudad=?,provincia=?,telefono=?)";
            Psentencia= GenericoBD.CONECTAR().prepareStatement(plantilla);
             Psentencia.setString(1,c.getIdCentro());
            Psentencia.setString(2,c.getNombre());
            Psentencia.setString(3,c.getCalle());
            Psentencia.setInt(4,c.getNumero());
             Psentencia.setInt(5, c.getCodPostal());
              Psentencia.setString(6,c.getCiudad() );
               Psentencia.setString(7, c.getProvincia());
                Psentencia.setInt(8, c.getTelefono());
             Psentencia.executeUpdate();
            
            GenericoBD.cerrarBD();
            
          }
          catch(Exception e){
             // La empresa existe, no es un problema
              // El resto de las excepciones si las relanzo
              GenericoBD.cerrarBD();     
                       }
                }
     /*
public static   ArrayList listaCentros(){
   
 
    String lu="";
    ArrayList<String>lislu;
    lislu=new ArrayList();
    try{
        con=GenericoBD.CONECTAR();
  String senten="Select nombre from CENTRO ;";
  Statement ps=con.createStatement();
  ResultSet resul=ps.executeQuery(senten);
  while(resul.next()==true)
     {      
         lu=resul.getString("nombre");
         lislu.add(lu);
       }
   con.close();
    }
    catch (Exception e){JOptionPane.showMessageDialog(null, "fallo en lugares" + e.getMessage() + c);}
 return lislu;
} 
    */
   //callables:
public static   ArrayList listaCentros(){
  String lu="";
ArrayList<String>listacentros=new ArrayList();

try{

GenericoBD.CONECTAR();

String sql= "{ call listacentros (?)} ";
CallableStatement llamada = con.prepareCall(sql);
llamada.registerOutParameter(1, OracleTypes.CURSOR); //parametro OUT
llamada.execute();
ResultSet res=null;
res=(ResultSet)llamada.getObject(1);
//ejecutar el procedimiento

    if(res.next())
     {      
         lu=res.getString("nombre");
      listacentros.add(lu);
       }   
                llamada.close();
                    con.close();} 
        catch (Exception e) {e.printStackTrace();}
//fin de mai      
return listacentros;
    }   
public static Trabajador consultaT(String vDni){
    t = new Trabajador();   
    try{
GenericoBD.CONECTAR();

String sql= "{ call consulta_trabajador (?,?)} ";
CallableStatement llamada = con.prepareCall(sql);
llamada.setString(1, vDni);
llamada.registerOutParameter(1, OracleTypes.CURSOR); //parametro OUT

ResultSet res=llamada.executeQuery();
res.getObject(2);
if(res.next()){
    t.setDni(res.getNString("dni"));
    t.setNombre(res.getNString("nombre"));
    t.setApellido1(res.getNString("apellido1"));
    t.setApellido2(res.getNString("apellido2"));
    t.setCalle(res.getNString("calle"));
    t.setMano(res.getNString("mano"));
    t.setCategoria(res.getNString("categoria"));
    t.setNumeroPortal(res.getInt("numeroPortal"));
    t.setTelEmpresa(res.getInt("telEmpresa"));
    t.setPiso(res.getInt("piso"));
    t.setTelPersonal(res.getInt("telPersonal"));
    t.setSalario(res.getDouble("salario"));
    t.setFechaNacimiento(res.getDate("fechaNacimiento"));
}
llamada.close();

con.close();

} catch (Exception e) {e.printStackTrace();}
//fin de main
    
   return t; 
}




}
    
    
    
    
    
    
    
    
    
    
    
            
    

