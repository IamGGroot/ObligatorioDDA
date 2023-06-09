package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Propietario extends Usuario {

    private double saldoMinimo;
    private Cuenta cuenta;
    private List<Notificacion> notificaciones;
    private List<Bonificacion> bonificaciones;
    private List<Vehiculo> misVehiculos;

    public Propietario(double saldoMinimo, Cuenta cuenta, String nombre, String password, int cedula) {
        super(nombre, password, cedula);
        this.saldoMinimo = saldoMinimo;
        this.cuenta = cuenta;
        this.notificaciones = new ArrayList();
        this.bonificaciones = new ArrayList();
        this.misVehiculos = new ArrayList();
    }

    public Propietario(String nombre, String password, int cedula) {
        super(nombre, password, cedula);
    }

    public List<Vehiculo> getMisVehiculos() {
        return misVehiculos;
    }

    public void agregarVehiculo(Vehiculo miVehiculo) {
        this.misVehiculos.add(miVehiculo);
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
        this.getNotificaciones().clear();
        notificar(Evento.NOTIFICACIONES_BORRADAS);
    }

    public Vehiculo getVehiculo(String matricula) {
        for (Vehiculo v : misVehiculos) {
            if (v.getMatricula().equals(matricula)) {
                return v;
            }
        }
        return null;
    }

    public boolean tieneRecargasPendientes() {
        return !this.cuenta.getRecargasPendientes().isEmpty();
    }

    public boolean tieneBonificacionAsignada(Puesto puestoSeleccionado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Transito> getTransitos() {
        List<Transito> transitos = new ArrayList();
        List<Vehiculo> vehiculos = this.getMisVehiculos();
        for (Vehiculo v : vehiculos) {
            transitos.addAll(v.getTransitos());
        }
        return transitos;
    }

}
