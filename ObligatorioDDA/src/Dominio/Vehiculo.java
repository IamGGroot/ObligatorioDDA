package Dominio;

import Observer.Observable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class Vehiculo extends Observable {

    private String matricula;
    private String color;
    private String modelo;
    private List<Transito> transitos;
    private Categoria categoria;
    private Propietario propietario;

    public Vehiculo(String matricula, String color, String modelo, Categoria categoria, Propietario propietario) {

        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
        this.transitos = new ArrayList();
        this.categoria = categoria;
        this.propietario = propietario;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public List<Transito> getTransitos() {
        return transitos;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void agregarTransito(Transito nuevoTransito) {
        this.transitos.add(nuevoTransito);
        String notificacion = "Pasaste por el puesto " + nuevoTransito.getPuesto().getNombre() + " con el vehículo " + nuevoTransito.getVehiculo().getMatricula();
        this.propietario.agregarNotificacion(new Notificacion(notificacion));
        this.propietario.registrarTransito(nuevoTransito.getMontoPagado());
        notificar(Evento.TRANSITO_AGREGADO);

    }

    public double montoTotalTransitos() {
        double montoTotal = 0;
        for (Transito t : transitos) {
            montoTotal += t.getMontoPagado();
        }
        return montoTotal;
    }

    List<Transito> obtenerTransitosPuestoFecha(Puesto puesto, LocalDate fecha) {
        List<Transito> transitosPuestoFecha = new ArrayList();

        for (Transito t : this.getTransitos()) {
            LocalDate fechaTActual = t.getFechaYHora().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if (t.getPuesto().equals(puesto) && fechaTActual.equals(fecha)) {
                transitosPuestoFecha.add(t);
            }
        }
        return transitosPuestoFecha;
    }

}
