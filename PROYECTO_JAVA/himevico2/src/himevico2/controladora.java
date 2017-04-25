/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package himevico2;

import Modelo.BD.CentroBD;
import Modelo.BD.ParteBD;
import Modelo.BD.TrabajadorBD;
import Modelo.BD.ViajeBD;
import Modelo.BD.tAdministradorBD;
import UML.Acceso;
import UML.Centro;
import UML.Parte;
import UML.Trabajador;
import UML.Viaje;
import Vistas.comboCentros;
import Vistas.datosTraba;
import Vistas.login;
import Vistas.panelAdmin;
import Vistas.panelCentro;
import Vistas.panelLg;
import Vistas.panelParte;
import Vistas.panelTipo;

import java.util.ArrayList;
 import java.sql.*;;

import javax.swing.JOptionPane;



/**
 *
 * @author Iker
 */
public class controladora {
    // PANELES
      private static comboCentros conmbC;
      private static panelTipo primera;
    private static login Vlogin;
    private static datosTraba dT;
 
  private static panelCentro panelC;
    private static panelAdmin PanelAdmin;
    private static panelLg panelLG;
    private static panelParte panelP;
    private static Trabajador T;
 //OBJETOS   
    private static Centro C;
    private static Acceso A;
    private static Parte P;
    private static Viaje V;
    private static ArrayList listViajes;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          try {    
            abrirPro();
            }       
         catch (Exception e){JOptionPane.showMessageDialog(null, "Error General");}     // TODO code application logic here
    }
        
     
     
        
                                
    public static void abrirmenu(){primera.setVisible(false);Vlogin=new login();primera.setVisible(true);}
    public static void abrirPro(){primera=new panelTipo();primera.setVisible(true);  }
    public static void cerrarV(){primera.dispose();primera.setVisible(false);}
   

  public static void abrirLogib(){Vlogin=new login();Vlogin.setVisible(true);}
  public static void acabarV(){ System.exit(0);}
        // TODO code application logic here
    
    public static void subirTR(String dni, String nombre, String apellido1, String apellido2, String calle, String mano, String categoria, int numeroPortal, int piso, int telEmpresa, int telPersonal, Double salario, Date fechaNacimiento,String usuario,String contraseña) throws Exception{
         A=new Acceso(usuario,contraseña,dni);
          T =new Trabajador( dni, nombre,  apellido1,  apellido2,  calle, mano, categoria, numeroPortal, piso,telEmpresa, telPersonal,  salario, fechaNacimiento,A);
         
          
           try{
         TrabajadorBD.altaT(T);}
           catch(Exception e){JOptionPane.showMessageDialog(null, "Error alta Trabajador");} 
    }
    public static void subirCentro( String nombre, String calle, int numero, int codPostal, String ciudad, String provincia, int telefono){
           C=new Centro( nombre,calle,numero,codPostal,ciudad,provincia,telefono);
           try{
         CentroBD.altaCentro(C);}
           catch(Exception e){JOptionPane.showMessageDialog(null, "Error alta C");} 
    }
    public static void subirAcceso(){
            A=new Acceso();
    
    
    }
    public static void abrirPanelAdmin(){primera.setVisible(false);PanelAdmin=new panelAdmin();PanelAdmin.setVisible(true);}
    public static void selecOperacion(String operacion){
        if((operacion.compareToIgnoreCase("alta" )==0)||operacion.compareToIgnoreCase("baja")==0||operacion.compareToIgnoreCase("modicar")==0)
        { dT=new datosTraba(operacion);primera.setVisible(false);dT.setVisible(true);  } 
      else
            panelC=new panelCentro(operacion);primera.setVisible(false);   panelC.setVisible(true);}
    public static void abrilpalelogist(){panelLG=new panelLg();primera.dispose();panelLG.setVisible(true);}
   
   
    public static  ArrayList  mostrarL()throws Exception{
         ArrayList<String>liCentros=new ArrayList();
             liCentros=CentroBD.listaCentros();
                     return liCentros;
     }
    public static Trabajador consultaT(String vDni){
        T=new Trabajador();
        T=tAdministradorBD.consultaT(vDni);
    return T;
    }
    public static void bajaT(String dni){
    try{
  TrabajadorBD.bajaT(dni);}
    catch (Exception e){};
    }
    public static void modificarT(String dni, String nombre, String apellido1, String apellido2, String calle, String mano, String categoria, int numeroPortal, int piso, int telEmpresa, int telPersonal, Double salario, Date fechaNacimiento)
    {     
        T=new Trabajador(dni, nombre,  apellido1,  apellido2,  calle, mano, categoria, numeroPortal, piso,telEmpresa, telPersonal,  salario, fechaNacimiento);
        try{
            TrabajadorBD.modificarT(T);}
        catch(Exception e){};
    
    
    }
    public static void consultaC(String nombre){
      CentroBD.listaCentros();
    
    }
    public static void modificarC(String nombre, String calle, int numero, int codPostal, String ciudad, String provincia, int telefono){
    C=new Centro( nombre,calle,numero,codPostal,ciudad,provincia,telefono);
           try{
        CentroBD.modificaCentro(C);}
           catch(Exception e){JOptionPane.showMessageDialog(null, "Error alta C");} 
    }
    public static void iniciarP(){    
              panelP=new panelParte();panelLG.setVisible(false);panelP.setVisible(true);
    }
    public static void subirP(Date fecha, Double kmInicio, Double kmFinal, boolean finalizado, Double gasoil, Double autopista, Double dietas, Double otrosGastos, String incidencias, Double horasTrabajadas){
       
           P =new Parte(fecha,kmInicio,kmFinal,finalizado,gasoil,autopista,dietas,otrosGastos,incidencias,horasTrabajadas);
           try {
          ParteBD.altaP(P);}
           catch (Exception e){JOptionPane.showMessageDialog(null, "Error alta P");}
    }
    public static void subirVI(String albaran,Date horaInicio,Date horaFin){
       
           V=new Viaje(albaran,horaInicio,horaFin);
           try {
          ViajeBD.altaV(V);}
           catch (Exception e){JOptionPane.showMessageDialog(null, "Error alta P");}
    }
    public static void selecOpParte(boolean finalizado){
   /* if(finalizado==true)
        subirP();
    else 
         finalizado=false;
    */
    }
    public static void subirViaje(String albaran,Date horaInicio, Date horaFin){
        V=new Viaje(albaran,horaInicio,horaFin);
    
    
    }
    public static boolean finViajes(boolean finalizado){
   finalizado=true;
    
    return finalizado;
    }
    public static void bajaCentro(String nombre){
        ArrayList<String>existeCentro=new ArrayList();
        existeCentro=CentroBD.listaCentros();
        for(int x=0;x<existeCentro.size();x++){
     if (nombre.compareToIgnoreCase(existeCentro.get(x))==0)
        try{
             CentroBD.bajaCentro(nombre);
        
        
        }
                   catch(Exception e){}
        
        }
        //preguntar si hay que sacar mensajes si el centro no existe
    
}

public static void mostrarCombo(){
         conmbC=new comboCentros();conmbC.setVisible(true);
    
    }
}
