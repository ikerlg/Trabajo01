/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package himevico2;

import Modelo.BD.tAdministradorBD;
import UML.Acceso;
import UML.Centro;
import UML.Trabajador;
import Vistas.datosTraba;
import Vistas.login;
import Vistas.panelAdmin;
import Vistas.panelCentro;
import Vistas.panelLg;
import Vistas.panelTipo;
import Vistas.vParte;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;


/**
 *
 * @author Iker
 */
public class controladora {
      private static panelTipo primera;
    private static login Vlogin;
    private static datosTraba dT;
    private static vParte vP;
  private static panelCentro panelC;
    private static panelAdmin PanelAdmin;
    private static panelLg panelLG;
    private static Trabajador T;
    private static Centro C;
    private static Acceso A;
    

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
   
  public static void abrirparte(){vP=new vParte();primera.setVisible(false);vP.setVisible(true);  }
  public static void abrirLogib(){Vlogin=new login();Vlogin.setVisible(true);}
  public static void acabarV(){ System.exit(0);}
        // TODO code application logic here
    
    public static void subirTR(String dni, String nombre, String apellido1, String apellido2, String calle, String mano, String categoria, int numeroPortal, int piso, int telEmpresa, int telPersonal, Double salario, Date fechaNacimiento){
          T =new Trabajador( dni, nombre,  apellido1,  apellido2,  calle, mano, categoria, numeroPortal, piso,telEmpresa, telPersonal,  salario, fechaNacimiento);
    }
    public static void subirCentro( String nombre, String calle, int numero, int codPostal, String ciudad, String provincia, int telefono){
           C=new Centro( nombre,calle,numero,codPostal,ciudad,provincia,telefono);
           try{
         tAdministradorBD.altaCentro(C);}
           catch(Exception e){JOptionPane.showMessageDialog(null, "Error alta C");} 
    }
    public static void subirAcceso(){
            A=new Acceso();
    
    
    }
    public static void abrirPanelAdmin(){primera.setVisible(false);PanelAdmin=new panelAdmin();PanelAdmin.setVisible(true);}
    public static String selecOperacion(String operacion){
        dT=new datosTraba(operacion);primera.setVisible(false);dT.setVisible(true);   
        return operacion;
                         }
    public static void abrilpalelogist(){panelLG=new panelLg();primera.dispose();panelLG.setVisible(true);}
    public static void subirTR(String text, String text0, String text1, String text2, String text3, String text4, String toString, int parseInt, int parseInt0, int parseInt1, int parseInt2, double parseDouble, Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void bajaCentro(String nombre){}
    public static  ArrayList  mostrarL()throws Exception{
         ArrayList<String>liCentros=new ArrayList();
             liCentros=tAdministradorBD.listaCentros();
                     return liCentros;
     }
    public static Trabajador consultaT(String vDni){
        T=new Trabajador();
        T=tAdministradorBD.consultaT(vDni);
    return T;
    }
    public static void bajaT(String dni){
    try{
    tAdministradorBD.bajaT(dni);}
    catch (Exception e){};
    }
    public static void modificarT(String dni, String nombre, String apellido1, String apellido2, String calle, String mano, String categoria, int numeroPortal, int piso, int telEmpresa, int telPersonal, Double salario, Date fechaNacimiento)
    {     
        T=new Trabajador(dni,nombre,apellido1,apellido2,calle,mano,categoria,numeroPortal,piso,telEmpresa,telPersonal,salario,fechaNacimiento);
        try{
            tAdministradorBD.modificarT(T);}
        catch(Exception e){};
    
    
    }
    public static void consultaC(String nombre){
       tAdministradorBD.listaCentros();
    
    }
    public static void modificarC(String nombre, String calle, int numero, int codPostal, String ciudad, String provincia, int telefono){
    C=new Centro( nombre,calle,numero,codPostal,ciudad,provincia,telefono);
           try{
         tAdministradorBD.modificaCentro(C);}
           catch(Exception e){JOptionPane.showMessageDialog(null, "Error alta C");} 
    }
    
    
}


