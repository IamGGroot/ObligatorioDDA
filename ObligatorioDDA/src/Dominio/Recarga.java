package Dominio;

import java.util.Date;

public class Recarga {
    private Date fechaYHora;
    private double monto;
    private Boolean aprobada;
    private Administrador administrador;

    public Recarga(double monto) {
        this.fechaYHora = new Date();
        this.monto = monto;
        this.aprobada = false;
        this.administrador = null;
    }   

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public Date getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(Date fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Boolean getAprobada() {
        return aprobada;
    }

    public void setAprobada(Boolean aprobada) {
        this.aprobada = aprobada;
    }
    
}
