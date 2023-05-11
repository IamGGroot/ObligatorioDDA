package Dominio;

import java.util.Date;


public class Sesion {
    
    private Usuario usuario;
    
    private Date fechaAcceso;
    private Date fechaLogout;

    public Sesion(Usuario usuario, Date fechaAcceso) {
        this.usuario = usuario;
        this.fechaAcceso = fechaAcceso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getFechaAcceso() {
        return fechaAcceso;
    }

    @Override
    public String toString() {
        //TODO: Pensar este metodo, si va o no y va a haber una lista en algun servicio que se encarga de sacar las sesiones y setear el logout
        return usuario.getNombre() + ") - " + fechaAcceso + fechaLogout;
    }
}
