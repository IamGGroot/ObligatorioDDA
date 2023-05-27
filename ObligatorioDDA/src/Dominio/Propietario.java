package Dominio;

import java.util.List;

public class Propietario extends Usuario {

    private double saldoMinimo;
    private Sesion sesion;
    private Cuenta cuenta;
    private List<Notificacion> notificaciones;
    private List<Bonificacion> bonificaciones;
    private List<Vehiculo> misVehiculos;

    public Sesion getSesion() {
        return sesion;
    }

    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }

    public List<Vehiculo> getMisVehiculos() {
        return misVehiculos;
    }

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

    public Vehiculo getVehiculo(String matricula ){
        for (Vehiculo v : misVehiculos) {
            if (v.getMatricula().equals(matricula)) {
                return v;
            }
        }
        return null;
    }
}
