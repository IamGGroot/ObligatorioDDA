package Dominio;

import java.util.Date;

public class Transito {

    private Date fechaYHora;
    private Bonificacion bonificacion;
    private Puesto puesto;
    private Vehiculo vehiculo;
    private double montoPagado;
    private double descuentoAplicado; 

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

    public void setDescuentoAplicado(double descuentoAplicado) {
        this.descuentoAplicado = descuentoAplicado;
    }

    public double getDescuentoAplicado() {
        return descuentoAplicado;
    }

    
    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public Bonificacion getBonificacion() {
        return bonificacion;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }  

}
