package Dominio;

import java.util.Date;

public class Recarga {

    private Date fechaYHora;
    private double monto;
    private Boolean aprobada;
    private Administrador administrador;

    public Recarga(Date fechaYHora, double monto) {
        this.fechaYHora = fechaYHora;
        this.monto = monto;
        this.aprobada = false;
        this.administrador = null;
    }

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

    public String getEstado() {
        if (aprobada) {
            return "Aprobada";
        }
        return "Pendiente";

    }

    public void aprobar(Administrador admin) {
        this.aprobada = true;
        this.administrador = admin;
    }
}
