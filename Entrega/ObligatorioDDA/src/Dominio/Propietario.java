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

    public List<Vehiculo> getMisVehiculos() {
        return misVehiculos;
    }

    public void agregarVehiculo(Vehiculo miVehiculo) {
        this.misVehiculos.add(miVehiculo);
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void agregarNotificacion(Notificacion n) {
        this.notificaciones.add(n);
        notificar(Evento.NOTIFICACION_AGREGADA);
    }

    public List<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public List<Bonificacion> getBonificaciones() {
        return bonificaciones;
    }

    public Bonificacion getBonificacion(Puesto puesto) {
        for (Bonificacion b : bonificaciones) {
            if (b.getPuesto() == puesto) {
                return b;
            }
        }
        return null;
    }

    public void agregarBonificacion(Bonificacion b) {
        this.bonificaciones.add(b);
        notificar(Evento.BONIFICACION_AGREGADA);
    }

    public void borrarNotificaciones() {
        this.getNotificaciones().clear();
        notificar(Evento.NOTIFICACIONES_BORRADAS);
    }

    public boolean tieneRecargasPendientes() {
        return !this.cuenta.getRecargasPendientes().isEmpty();

    }

    public Bonificacion existeBonificacionEnPuesto(Puesto puesto) {
        for (Bonificacion b : this.getBonificaciones()) {
            if (b.getPuesto() == puesto) {
                return b;
            }
        }
        return null;
    }

    public List<Transito> getTransitos() {
        List<Transito> transitos = new ArrayList();
        List<Vehiculo> vehiculos = this.getMisVehiculos();
        for (Vehiculo v : vehiculos) {
            transitos.addAll(v.getTransitos());
        }
        return transitos;
    }

    public void registrarTransito(double montoPagado) {
        this.getCuenta().actualizarSaldo(montoPagado);
        Double saldoActual = this.getCuenta().getSaldo();
        if (saldoActual < this.getSaldoMinimo()) {
            String notificacionSaldo = "Tu saldo actual es de $" + saldoActual + " Te recomendamos hacer una recarga";
            this.agregarNotificacion(new Notificacion(notificacionSaldo));
        }
    }
}
