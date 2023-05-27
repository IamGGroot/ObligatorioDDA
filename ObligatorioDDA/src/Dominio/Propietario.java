package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Propietario extends Usuario {

    private double saldoMinimo;
    private Sesion sesion;
    private Cuenta cuenta;
    private List<Notificacion> notificaciones;
    private List<Bonificacion> bonificaciones;

    public Propietario(double saldoMinimo, Cuenta cuenta, String nombre, String password, int cedula) {
        super(nombre, password, cedula);
        this.saldoMinimo = saldoMinimo;
        this.cuenta = cuenta;
        this.notificaciones = new ArrayList();;
        this.bonificaciones = new ArrayList();;
    }

    public Propietario(String nombre, String password, int cedula) {
        super(nombre, password, cedula);
    }

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

    public void agregarNotificacion(Notificacion n) {
        this.notificaciones.add(n);

    }

    public List<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public List<Bonificacion> getBonificaciones() {
        return bonificaciones;
    }

    public void agregarBonificacion(Bonificacion b) {
        this.bonificaciones.add(b);

    }

    public void borrarNotificaciones() {
        this.getBonificaciones().clear();
    }

    /*public vehiculo getVehiculo(String matricula ){
    
    }*/
}
