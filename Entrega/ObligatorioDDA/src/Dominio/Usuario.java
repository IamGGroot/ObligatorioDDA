package Dominio;

import Observer.Observable;

public abstract class Usuario extends Observable {

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

    public String getNombre() {
        return nombre;
    }

    public boolean validarCredenciales(int cedula, String password) {
        return this.cedula == cedula && this.password.equals(password);

    }

}
