package Controlador;

import Dominio.Administrador;
import Interfaz.VistaPrincipalAdministrador;

public class ControladorVistaPrincipal {

    VistaPrincipalAdministrador vista;
    Administrador usuarioAdmin;

    public ControladorVistaPrincipal(VistaPrincipalAdministrador vista, Administrador usuario) {
        this.vista = vista;
        this.usuarioAdmin = usuario;
    }

    public void cerrar() {
        if (vista.confirmar("Confirma que desea salir", "Salir del sistema")) {
            usuarioAdmin.setLogueado(false);
            vista.salir();
        }
    }

    public void emularTransito() {
        vista.emularTransito(usuarioAdmin);
    }

    public void emularAprobacionRecarga() {
        vista.emularAprobacionRecarga(usuarioAdmin);
    }

    public void asignarBonificacion() {
        vista.asignarBonificacion(usuarioAdmin);
    }

}
