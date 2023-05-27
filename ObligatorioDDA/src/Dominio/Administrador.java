
package Dominio;


public class Administrador extends Usuario {
    
    private Sesion sesion;

    public Administrador(String nombre, String password, int cedula) {
        super(nombre, password, cedula);
    }
    
    public Sesion getSesion() {
        return sesion;
    }

    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }
    
}
