package Interfaz;

import Dominio.Usuario;

public interface VistaLogin {

    public void mostrarError(String msg);

    public void cerrarVentana();

    public void ejecutarLogin(Usuario usu);
}
