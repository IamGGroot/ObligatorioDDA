package Dominio;

public abstract class Usuario {

    //private String tipoUsuario; //aca va a ser como en agenda? 
    private String nombre;

    private String password;

    private int cedula;

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validarCredenciales(String usuario, String password) {
        return this.nombre.equalsIgnoreCase(usuario) && this.password.equals(password);
    }

}
