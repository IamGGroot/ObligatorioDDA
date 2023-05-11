package Dominio;

import java.util.Date;

public class Bonificacion {
    private Date fechaAsignada;
    private Puesto puesto;
    private Propietario propietario;
    private TipoBonificacion tipoBonificacion;
    
    public Bonificacion(Puesto p, Propietario pr, TipoBonificacion tb){
        this.fechaAsignada = new Date();
        this.puesto = p;
        this.propietario = pr;
        this.tipoBonificacion = tb;
    }

    public Date getFechaAsignada() {
        return fechaAsignada;
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
}
