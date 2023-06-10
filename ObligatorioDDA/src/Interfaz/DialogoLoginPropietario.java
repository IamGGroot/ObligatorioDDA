
package Interfaz;

import Controlador.ControladorLoginPropietario;
import Dominio.Propietario;
import Dominio.Usuario;
import java.awt.Frame;


public class DialogoLoginPropietario extends DialogoLoginGenerico {

    public DialogoLoginPropietario(Frame parent, boolean modal) {
        super(parent, modal);
        super.setControlador(new ControladorLoginPropietario(this));
        this.setTitle("Ingrese sus credenciales de propietario");
    }

    @Override
    protected String getSubtitulo() {
        return "Bienvenido usuario Propietario de sistema de peajes";
    }

    @Override
    public void ejecutarLogin(Usuario usuarioPropietario) {
        new DialogoTableroPropietario((java.awt.Frame) this.getParent(), false, (Propietario) usuarioPropietario).setVisible(true);
    }
}
