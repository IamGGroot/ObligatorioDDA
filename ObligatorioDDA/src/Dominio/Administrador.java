
package Dominio;


public class Administrador extends Usuario {
    
    private boolean logueado;

    public Administrador(String nombre, String password, int cedula) {
        super(nombre, password, cedula);
    }

    public boolean isLogueado() {
        return logueado;
    }

    public void setLogueado(boolean logueado) {
        this.logueado = logueado;
    }
        
}
