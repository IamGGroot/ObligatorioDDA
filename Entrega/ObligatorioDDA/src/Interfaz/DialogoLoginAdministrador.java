
package Interfaz;

import Controlador.ControladorLoginAdministrador;
import Dominio.Administrador;

import java.awt.Frame;
import Dominio.Usuario;


public class DialogoLoginAdministrador extends DialogoLoginGenerico {

    public DialogoLoginAdministrador(Frame parent, boolean modal) {
        super(parent, modal);
        super.setControlador(new ControladorLoginAdministrador(this));
        this.setTitle("Ingrese sus credenciales de Administrador");
    }

    @Override
    protected String getSubtitulo() {
        return "Bienvenido usuario Administrador de sistema de peajes";
    }

    @Override
    public void ejecutarLogin(Usuario usuarioAdmin) {
        new DialogoPrincipalAdministrador((java.awt.Frame) this.getParent(), false, (Administrador) usuarioAdmin).setVisible(true);
    }

}
