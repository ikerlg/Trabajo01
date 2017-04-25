/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Iker
 */
public class Parte {
 private    String idParte;
  private   Date fecha;
  private   Double kmInicio;
  private   Double kmFinal;
  private   boolean finalizado;
  private   Double gasoil;
   private Double autopista;
  private   Double dietas;
  private   Double otrosGastos;
   private  String incidencias;
  private   Double horasTrabajadas;
  private   tAdministrador tA;
   private  tLogistica tL;
  private   Vehiculo V;
  private   ArrayList<Viaje> listaViajes;

    public Parte() {
    }

   

    public Parte( Date fecha, Double kmInicio, Double kmFinal, boolean finalizado, Double gasoil, Double autopista, Double dietas, Double otrosGastos, String incidencias, Double horasTRabajadas) {
        this.idParte = idParte;
        this.fecha = fecha;
        this.kmInicio = kmInicio;
        this.kmFinal = kmFinal;
        this.finalizado = finalizado;
        this.gasoil = gasoil;
        this.autopista = autopista;
        this.dietas = dietas;
        this.otrosGastos = otrosGastos;
        this.incidencias = incidencias;
        this.horasTrabajadas = horasTRabajadas;
            listaViajes = new ArrayList();;
     
    }

    public Double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Vehiculo getV() {
        return V;
    }

    public void setV(Vehiculo V) {
        this.V = V;
    }

    public ArrayList<Viaje> getListViajes() {
        return listaViajes;
    }

    public void setListViajes(ArrayList<Viaje> listViajes) {
        this.listaViajes = listViajes;
    }

    public String getIdParte() {
        return idParte;
    }

    public void setIdParte(String idParte) {
        this.idParte = idParte;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getKmInicio() {
        return kmInicio;
    }

    public void setKmInicio(Double kmInicio) {
        this.kmInicio = kmInicio;
    }

    public Double getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(Double kmFinal) {
        this.kmFinal = kmFinal;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Double getGasoil() {
        return gasoil;
    }

    public void setGasoil(Double gasoil) {
        this.gasoil = gasoil;
    }

    public Double getAutopista() {
        return autopista;
    }

    public void setAutopista(Double autopista) {
        this.autopista = autopista;
    }

    public Double getDietas() {
        return dietas;
    }

    public void setDietas(Double dietas) {
        this.dietas = dietas;
    }

    public Double getOtrosGastos() {
        return otrosGastos;
    }

    public void setOtrosGastos(Double otrosGastos) {
        this.otrosGastos = otrosGastos;
    }

    public String getIncidencias() {
        return incidencias;
    }

    public void setIncidencias(String incidencias) {
        this.incidencias = incidencias;
    }

    public Double getHorasTRabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTRabajadas(Double horasTRabajadas) {
        this.horasTrabajadas = horasTRabajadas;
    }

    public tAdministrador gettA() {
        return tA;
    }

    public void settA(tAdministrador tA) {
        this.tA = tA;
    }

    public tLogistica gettL() {
        return tL;
    }

    public void settL(tLogistica tL) {
        this.tL = tL;
    }
    
    
    
    
}
