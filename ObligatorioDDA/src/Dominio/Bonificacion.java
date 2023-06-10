package Dominio;

import java.util.Date;

public class Bonificacion implements Renderizable {

    private Date fechaAsignada;
    private Puesto puesto;
    private Propietario propietario;
    private TipoBonificacion tipoBonificacion;
    private Transito transito;

    public Bonificacion(Date fechaAsignada, Puesto puesto, Propietario propietario, TipoBonificacion tipoBonificacion) {
        this.fechaAsignada = fechaAsignada;
        this.puesto = puesto;
        this.propietario = propietario;
        this.tipoBonificacion = tipoBonificacion;
    }

    public Date getFechaAsignada() {
        return this.fechaAsignada;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public TipoBonificacion getTipoBonificacion() {
        return tipoBonificacion;
    }

    public void setFechaAsignada(Date fechaAsignada) {
        this.fechaAsignada = fechaAsignada;
    }

    public void setTipoBonificacion(TipoBonificacion tipoBonificacion) {
        this.tipoBonificacion = tipoBonificacion;
    }

    public Transito getTransito() {
        return transito;
    }

    public void setTransito(Transito transito) {
        this.transito = transito;
    }

    public int calcularBonificacion() {
        return this.tipoBonificacion.calcularDescuento(this.transito);
    }


    @Override
    public String getRenderDetail() {
        return this.getTipoBonificacion().getNombre();
    }
}
