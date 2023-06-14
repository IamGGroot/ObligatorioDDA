package Dominio;

import java.util.Date;

public class Transito {

    private Date fechaYHora;
    private Bonificacion bonificacion;
    private Puesto puesto;
    private Vehiculo vehiculo;
    private double montoPagado;
    private int descuentoAplicado; 

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

    public void setDescuentoAplicado(int descuentoAplicado) {
        this.descuentoAplicado = descuentoAplicado;
    }

    public int getDescuentoAplicado() {
        return descuentoAplicado;
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

    public Vehiculo getVehiculo() {
        return vehiculo;
    }  

}
