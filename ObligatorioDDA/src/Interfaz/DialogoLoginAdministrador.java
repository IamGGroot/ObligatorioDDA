/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Dominio.Administrador;
import java.awt.Frame;
import Dominio.Usuario;
import Exceptions.SistemaPeajeException;
import Servicios.FachadaServicios;

/**
 *
 * @author Santiago
 */
public class DialogoLoginAdministrador extends DialogoLoginGenerico {

    public DialogoLoginAdministrador(Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("Ingrese sus credenciales de Administrador");
    }

    @Override
    protected Usuario loginUsuarioGenerico(int nombreUsuario, String password) throws SistemaPeajeException {
        return FachadaServicios.getInstancia().loginAdministrador(nombreUsuario, password);
    }

    @Override
    protected void ejecutarCasoLogin(Usuario usuarioAdmin) {
        new DialogoEmularTransito((java.awt.Frame) this.getParent(), false, (Administrador) usuarioAdmin).setVisible(true);
    }

    @Override
    protected String getSubtitulo() {
        return "Bienvenido usuario Administrador de sistema de peajes";
    }
}
