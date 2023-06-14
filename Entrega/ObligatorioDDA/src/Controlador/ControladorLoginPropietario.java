
package Controlador;

import Dominio.Usuario;
import Exceptions.SistemaPeajeException;
import Interfaz.VistaLogin;
import Servicios.FachadaServicios;


public class ControladorLoginPropietario extends ControladorLogin {

    public ControladorLoginPropietario(VistaLogin vista) {
        super(vista);
    }

    @Override
    public void loginUsuario(int cedula, String password) {
        try {
            Usuario usuario = FachadaServicios.getInstancia().loginPropietario(cedula, password);
            this.vista.ejecutarLogin(usuario);
        } catch (SistemaPeajeException ex) {
            this.vista.mostrarError(ex.getMessage());
        }
    }

}
