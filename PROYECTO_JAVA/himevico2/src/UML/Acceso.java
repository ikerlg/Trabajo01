/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

/**
 *
 * @author Iker
 */
public class Acceso {
private    String usuario;
 private    String contraseña;
  private   Trabajador T;


    public Acceso() {
    }

    public Acceso(String usuario, String contraseña,String dni) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.T.setDni(dni);
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Trabajador getT() {
        return T;
    }

    public void setT(Trabajador T) {
        this.T = T;
    }
    
    
}
