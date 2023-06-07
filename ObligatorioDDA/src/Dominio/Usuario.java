package Dominio;

import Observer.Observable;

public abstract class Usuario extends Observable {

    //private String tipoUsuario; //aca va a ser como en agenda? 
    private String nombre;

    private String password;

    private int cedula;

    public Usuario(String nombre, String password, int cedula) {
        this.nombre = nombre;
        this.password = password;
        this.cedula = cedula;
    }

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

    public boolean validarCredenciales(int cedula, String password) {
        //TODO acá podemos recibir string y tirar una esxcepción si no es una cedula valida?
        return this.cedula == cedula && this.password.equals(password);


    }

}
