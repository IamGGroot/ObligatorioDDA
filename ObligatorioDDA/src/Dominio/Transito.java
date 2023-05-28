package Dominio;

import java.util.Date;

public class Transito {

    private Date fechaYHora;
    private double montoPagado;
    private Bonificacion bonificacion;
    private Puesto puesto;

    public Date getFechaYHora() {
        return fechaYHora;
    }

    public Transito(Date fechaYHora, double montoPagado, Bonificacion bonificacion, Puesto puesto) {
        this.fechaYHora = fechaYHora;
        this.montoPagado = montoPagado;
        this.bonificacion = bonificacion;
        this.puesto = puesto;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
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
    
    
    public double calcularMonto(Vehiculo vehiculo){
        double tarifa = puesto.tarifaVehiculo(vehiculo);
        int descuento = bonificacion.calcularBonificacion();
        return tarifa - descuento;
    }

}
