package Dominio;

import java.util.Date;

public class Transito {

    private Date fechaYHora;
    private Bonificacion bonificacion;
    private Puesto puesto;
    private Vehiculo vehiculo;
    private double montoPagado;

    public Transito(Date fechaYHora, Bonificacion bonificacion, Puesto puesto, Vehiculo vehiculo, double montoPagado) {
        this.fechaYHora = fechaYHora;
        this.bonificacion = bonificacion;
        this.puesto = puesto;
        this.vehiculo = vehiculo;
        this.montoPagado = montoPagado;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public Date getFechaYHora() {
        return fechaYHora;
    }


    public Bonificacion getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(Bonificacion bonificacion) {
        this.bonificacion = bonificacion;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public double calcularMonto(Vehiculo vehiculo) {
        double tarifa = puesto.tarifaParaVehiculo(vehiculo).getMonto();
        int descuento = bonificacion.calcularBonificacion();
        return tarifa - descuento;
    }

}
