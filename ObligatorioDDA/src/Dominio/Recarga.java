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

    public Administrador getAdministrador() {
        return administrador;
    }

    public Date getFechaYHora() {
        return fechaYHora;
    }

    public double getMonto() {
        return monto;
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
