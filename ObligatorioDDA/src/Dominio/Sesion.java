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

}
