
package Dominio;


public class Administrador extends Usuario {
    
    private Sesion sesion;
    
    public Sesion getSesion() {
        return sesion;
    }

    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }
    
}
