/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Excepciones.*;
import Modelo.BD.tAdministradorBD;
import himevico2.controladora;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import himevico2.*;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Iker
 */
public class datosTraba extends javax.swing.JFrame {
  private static String operacion;
    /**
     * Creates new form Trabajador
     */
  
  
 public datosTraba(String operacion) {
      ArrayList<String>lcen=new ArrayList();
         this.operacion = operacion;
        initComponents();
          setLocationRelativeTo(null);
             try{
                  lcen=controladora.mostrarL();
         
                     for(int x=0;x<lcen.size();x++){
        
                            comboC.insertItemAt(lcen.get(x),x);
            
                             }}
        catch(Exception e){JOptionPane.showMessageDialog(null,"error en la vista");}
             }        
    
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Categoria = new javax.swing.ButtonGroup();
        jLabel14 = new javax.swing.JLabel();
        DatosPersonales = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tsegundoAT = new javax.swing.JTextField();
        tdniT = new javax.swing.JTextField();
        tnombreT = new javax.swing.JTextField();
        tprimerAT = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ttlfempreT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ttlfpersoT = new javax.swing.JTextField();
        tSalarioT = new javax.swing.JTextField();
        direccion = new javax.swing.JPanel();
        tpisoT = new javax.swing.JTextField();
        tcalleT = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tmanoT = new javax.swing.JTextField();
        tportalT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        calendarnacimientoT = new com.toedter.calendar.JCalendar();
        jLabel12 = new javax.swing.JLabel();
        bAceptar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        administracion = new javax.swing.JRadioButton();
        logistica = new javax.swing.JRadioButton();
        acceso = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tusuarioT = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        comboC = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 0));
        setMinimumSize(new java.awt.Dimension(630, 635));
        setSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(null);

        jLabel14.setText("Salario");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(310, 400, 60, 30);

        DatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales"));
        DatosPersonales.setLayout(null);

        jLabel3.setText("Segundo Apeliido");
        DatosPersonales.add(jLabel3);
        jLabel3.setBounds(30, 130, 110, 16);

        jLabel4.setText("Dni");
        DatosPersonales.add(jLabel4);
        jLabel4.setBounds(100, 30, 50, 30);

        jLabel7.setText("Nombre");
        DatosPersonales.add(jLabel7);
        jLabel7.setBounds(80, 60, 60, 30);

        jLabel6.setText("Primer Apellido");
        DatosPersonales.add(jLabel6);
        jLabel6.setBounds(40, 100, 100, 16);

        tsegundoAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsegundoATActionPerformed(evt);
            }
        });
        DatosPersonales.add(tsegundoAT);
        tsegundoAT.setBounds(150, 120, 200, 30);
        DatosPersonales.add(tdniT);
        tdniT.setBounds(140, 30, 210, 26);
        DatosPersonales.add(tnombreT);
        tnombreT.setBounds(140, 60, 210, 26);
        DatosPersonales.add(tprimerAT);
        tprimerAT.setBounds(140, 90, 210, 26);

        getContentPane().add(DatosPersonales);
        DatosPersonales.setBounds(20, 90, 440, 170);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefonos"));
        jPanel3.setLayout(null);

        jLabel2.setText("Empresa");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 20, 60, 30);
        jPanel3.add(ttlfempreT);
        ttlfempreT.setBounds(100, 20, 160, 26);

        jLabel11.setText("Personal");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(30, 60, 53, 30);
        jPanel3.add(ttlfpersoT);
        ttlfpersoT.setBounds(100, 60, 160, 26);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 270, 280, 110);
        getContentPane().add(tSalarioT);
        tSalarioT.setBounds(360, 400, 150, 26);

        direccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Direccion"));
        direccion.setLayout(null);
        direccion.add(tpisoT);
        tpisoT.setBounds(90, 120, 60, 26);
        direccion.add(tcalleT);
        tcalleT.setBounds(90, 20, 170, 26);

        jLabel17.setText("Calle");
        direccion.add(jLabel17);
        jLabel17.setBounds(20, 20, 60, 20);

        jLabel18.setText("Piso");
        direccion.add(jLabel18);
        jLabel18.setBounds(20, 120, 53, 30);

        jLabel19.setText("Mano");
        direccion.add(jLabel19);
        jLabel19.setBounds(20, 50, 34, 30);

        jLabel20.setText("Portal");
        direccion.add(jLabel20);
        jLabel20.setBounds(20, 80, 53, 30);
        direccion.add(tmanoT);
        tmanoT.setBounds(90, 50, 60, 26);
        direccion.add(tportalT);
        tportalT.setBounds(90, 80, 60, 26);

        getContentPane().add(direccion);
        direccion.setBounds(20, 410, 280, 160);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setText("DATOS      TRABAJADOR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 10, 460, 40);
        getContentPane().add(calendarnacimientoT);
        calendarnacimientoT.setBounds(310, 450, 260, 120);

        jLabel12.setText("Fecha Nacimiento");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(310, 430, 180, 16);

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(bAceptar);
        bAceptar.setBounds(170, 580, 130, 29);

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        getContentPane().add(bSalir);
        bSalir.setBounds(310, 580, 120, 29);

        administracion.setText("ADMIISTRACION");
        getContentPane().add(administracion);
        administracion.setBounds(170, 60, 150, 23);

        logistica.setText("LOGISTICA");
        getContentPane().add(logistica);
        logistica.setBounds(330, 60, 99, 23);

        acceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acceso"));
        acceso.setLayout(null);

        usuario.setText("Usuario");
        acceso.add(usuario);
        usuario.setBounds(40, 20, 60, 30);

        jLabel8.setText("Contraseña");
        acceso.add(jLabel8);
        jLabel8.setBounds(10, 70, 80, 16);
        acceso.add(tusuarioT);
        tusuarioT.setBounds(90, 20, 170, 30);
        acceso.add(jTextField1);
        jTextField1.setBounds(90, 60, 170, 30);

        getContentPane().add(acceso);
        acceso.setBounds(300, 270, 270, 110);

        comboC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCActionPerformed(evt);
            }
        });
        getContentPane().add(comboC);
        comboC.setBounds(460, 137, 96, 40);

        jLabel5.setText("Centro");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(480, 120, 45, 16);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/arenaG.jpeg"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, -20, 630, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tsegundoATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsegundoATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsegundoATActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        // TODO add your handling code here:
         if (operacion.compareTo("baja")== 0)
       {
           doBaja();
       }
       else
           if (operacion.compareTo("modificar")== 0)
           {
               doModificar();
           }
           else
               doAlta();
       
       // switch
    private void doModificar()
    { 
        try{
           if (datosCorrectos())
           {
             javax.swing.JOptionPane.showMessageDialog(this,"Datos correctos. Vamos a grabar los cambios");
             Controlador.doUpdate((String) cbLugar.getSelectedItem(),dcFecha.getDate(),tffHoraInicio.getText(),tftHoraFin.getText(),Integer.parseInt(tffAforo.getText()));
             Controlador.volver(this);
           }
       }
       catch(Exception e)
       {
         javax.swing.JOptionPane.showMessageDialog(this,"Problemas con el alta "+e.getClass());
       }
}
    private void doBaja(){
         String dni="";
        dni=JOptionPane.showInputDialog(null,"Dni del trabajador a eliminar?");
    
       try{
             int respuesta = javax.swing.JOptionPane.showConfirmDialog(this,"¿ Estas segur@?");
             if (respuesta == 0)
                tAdministradorBD.bajaT(dni);
          
          
       }
       catch(Exception e)
       {
         javax.swing.JOptionPane.showMessageDialog(this,"Problemas con la baja "+e.getClass());
       }
    }
    
    private void doAlta(){
        try
        {
           if (datosCorrectos())
           {
             javax.swing.JOptionPane.showMessageDialog(this,"Datos correctos. Vamos a insertar en la base de  datos");
         controladora.subirTR(tdniT.getText(),tnombreT.getText(),tprimerAT.getText(),tsegundoAT.getText(),tcalleT.getText(),tmanoT.getText(),Categoria.getSelection().toString(),Integer.parseInt(tportalT.getText()),Integer.parseInt(tpisoT.getText()),Integer.parseInt(ttlfempreT.getText()),Integer.parseInt(ttlfpersoT.getText()),Double.parseDouble(tSalarioT.getText()),calendarnacimientoT.getDate());
           // controladora.subirCebtro(operacion, operacion, operacion, operacion, ERROR, NORMAL, ERROR);
            //controladora.
           }
       }
       catch(Exception e)
       {
         javax.swing.JOptionPane.showMessageDialog(this,"Problemas con el alta "+e.getClass());
       }
       

    }//GEN-LAST:event_bAceptarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        // TODO add your handling code here:
        controladora.acabarV();
    }//GEN-LAST:event_bSalirActionPerformed

    private void comboCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCActionPerformed
 private boolean datosCorrectos(){
        try{
            validarNombre();
             validartelefono();
            validarFecha();
         
            return true;
        }
        catch(CampoVacio e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,e.getMensaje());
            return false;
        }
        catch(NombreNoValido e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"El nombre del evento no es válido. \n Tiene que empezar con una letra y tener una longitud minima de 3");
            return false;
        }
       
       
        catch(FechaNoValida e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"La fecha tecleada no es válida");
            return false;
        }
        
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"Problemas validando los datos de entrada");
            return false;
        }
    }
    
    private void validarNombre()throws Exception{
        String nombre = tnombreT.getText();
        if (nombre.isEmpty())
            throw new CampoVacio("El nombre del acontecimiento es un dato obligatorio");
        // Considero que debe empezar por una letra y tener un mínimo de 3 caracteres
        Character primerCaracter = nombre.charAt(0);
        if (Character.isDigit(primerCaracter) || nombre.length()< 3)
            throw new NombreNoValido();
     
    }
    
  
    
    private void validarFecha()throws Exception{
        if (calendarnacimientoT.getCalendar()== null)
            throw new CampoVacio("El fecha del acontecimiento es un dato obligatorio");
  
        // Comprobar que es mayor que la fecha actual
        // Guardar la fecha de hoy
        Calendar hoy = Calendar.getInstance();
        Calendar fechaEvento = calendarnacimientoT.getCalendar();
        // Comparar dos fechas
        if (fechaEvento.before(hoy))
                throw new FechaNoValida();
    }
    
   
    
    private void validartelefono()throws Exception{
        String nombre=ttlfempreT.getText();
        if (nombre.isEmpty())
            throw new CampoVacio("El telefono debe ser de un maximo de 10 digitos");
        
                         nombre=nombre.toUpperCase();
                          Pattern n=Pattern.compile("[0-9]{10}");
                          Matcher m= n.matcher(nombre);
          }
       
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(datosTraba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datosTraba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datosTraba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datosTraba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datosTraba(operacion).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Categoria;
    private javax.swing.JPanel DatosPersonales;
    private javax.swing.JPanel acceso;
    private javax.swing.JRadioButton administracion;
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bSalir;
    private com.toedter.calendar.JCalendar calendarnacimientoT;
    private javax.swing.JComboBox<String> comboC;
    private javax.swing.JPanel direccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton logistica;
    private javax.swing.JTextField tSalarioT;
    private javax.swing.JTextField tcalleT;
    private javax.swing.JTextField tdniT;
    private javax.swing.JTextField tmanoT;
    private javax.swing.JTextField tnombreT;
    private javax.swing.JTextField tpisoT;
    private javax.swing.JTextField tportalT;
    private javax.swing.JTextField tprimerAT;
    private javax.swing.JTextField tsegundoAT;
    private javax.swing.JTextField ttlfempreT;
    private javax.swing.JTextField ttlfpersoT;
    private javax.swing.JTextField tusuarioT;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
