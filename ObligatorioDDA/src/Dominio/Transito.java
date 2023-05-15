package Dominio;

import java.util.Date;

public class Transito {

    private Date fechaYHora;
    private double montoPagado;
    private Bonificacion bonificacion;
    //TODO() Repeensar si deberia conocer la bonificacion o lo conoce a traves de puesto
    private Puesto puesto;

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

}