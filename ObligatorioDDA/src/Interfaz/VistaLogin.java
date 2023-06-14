package Interfaz;

import Dominio.Usuario;

public interface VistaLogin {

    public void mostrarError(String msg);

    public void salir();

    public void ejecutarLogin(Usuario usu);

    public void mostrarTitulo(String title);
}
