package Dominio;

import java.util.Date;

public class Notificacion {

    private String mensaje;
    private Date fechaYHora;

    public Notificacion(String mensaje) {
        this.mensaje = mensaje;
        this.fechaYHora = new Date();
    }

    public Notificacion(String mensaje, Date fechaYHora) {
        this.mensaje = mensaje;
        this.fechaYHora = fechaYHora;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(Date fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

}
