package Dominio;

import java.util.Date;

public class Bonificacion {

    private String nombre;
    private Date fechaAsignada;
    private Puesto puesto;
    private Propietario propietario;
    private TipoBonificacion tipoBonificacion;
    private Transito transito;

    public Bonificacion(String nombre, Date fechaAsignada, Puesto puesto, Propietario propietario, TipoBonificacion tipoBonificacion) {
        this.nombre = nombre;
        this.fechaAsignada = fechaAsignada;
        this.puesto = puesto;
        this.propietario = propietario;
        this.tipoBonificacion = tipoBonificacion;
    }

    public Bonificacion() {

    }

    public String getNombre() {
        return nombre;
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

    public Transito getTransito() {
        return transito;
    }

    public void setTransito(Transito transito) {
        this.transito = transito;
    }

    public int calcularBonificacion() {
        return this.tipoBonificacion.calcularDescuento(transito);
    }
}
