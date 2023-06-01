/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Controlador.ControladorLoginAdministrador;
import Dominio.Administrador;

import java.awt.Frame;
import Dominio.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago
 */
public class DialogoLoginAdministrador extends DialogoLoginGenerico {

    public DialogoLoginAdministrador(Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("Ingrese sus credenciales de Administrador");
        this.setControlador(new ControladorLoginAdministrador(this));
    }

    @Override
    protected String getSubtitulo() {
        return "Bienvenido usuario Administrador de sistema de peajes";
    }

    @Override
    public void mostrarError(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Login incorrecto", JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void cerrarVentana() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ejecutarLogin(Usuario usuarioAdmin) {
        new DialogoEmularTransito((java.awt.Frame) this.getParent(), false, (Administrador) usuarioAdmin).setVisible(true);
    }

}
