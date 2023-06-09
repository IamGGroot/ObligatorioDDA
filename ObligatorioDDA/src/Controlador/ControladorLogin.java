
package Controlador;

import Interfaz.VistaLogin;

public abstract class ControladorLogin {

    VistaLogin vista;

    public ControladorLogin(VistaLogin vista) {
        this.vista = vista;
    }

    public abstract void loginUsuario(int cedula, String password);
}
