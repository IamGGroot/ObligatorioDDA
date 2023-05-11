/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.ArrayList;

/**
 *
 * @author imm
 */
public class Propietario extends Usuario {
    
   private double saldoMinimo;

   private Sesion sesion;
 
   //private ArrayList<Vehiculo> misVehiculos;
   //private Cuenta cuenta;

    public Sesion getSesion() {
        return sesion;
    }

    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }

    /*
    
    public ArrayList<Vehiculo> getMisVehiculos() {
        return misVehiculos;
    }
    
    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }*/
   
    public double getSaldoMinimo() {
        return saldoMinimo;
    }
    
    
    public void borrarNotificaciones(){
    
    }
    
    /*public vehiculo getVehiculo(String matricula ){
    
    }
    
    public int getBonificaciones(){
    
    }*/
    
    
}
