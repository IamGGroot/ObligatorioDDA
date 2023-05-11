package Dominio;

import java.util.List;

public class Propietario extends Usuario {

    private double saldoMinimo;
    private Sesion sesion;
    private Cuenta cuenta;
    private List<Notificacion> notificaciones;
    private List<Bonificacion> bonificaciones;

    //TODO() Falta completar con las demás clases que usa propietario.
    //private List<Vehiculo> misVehiculos;
    public Sesion getSesion() {
        return sesion;
    }

    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }

    /*
    
    public List<Vehiculo> getMisVehiculos() {
        return misVehiculos;
    }*/
    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public List<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(List<Notificacion> notificaciones) {
        this.notificaciones = notificaciones;
    }

    public List<Bonificacion> getBonificaciones() {
        return bonificaciones;
    }

    public void setBonificaciones(List<Bonificacion> bonificaciones) {
        this.bonificaciones = bonificaciones;
    }
    
    
    public void borrarNotificaciones() {
        this.getBonificaciones().clear();
    }

    /*public vehiculo getVehiculo(String matricula ){
    
    }*/
    
}
