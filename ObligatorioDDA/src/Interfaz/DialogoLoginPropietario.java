/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import Controlador.ControladorLoginPropietario;
import Dominio.Propietario;
import Dominio.Usuario;
import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 *
 * @author anapl
 */
public class DialogoLoginPropietario extends DialogoLoginGenerico {

    public DialogoLoginPropietario(Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("Ingrese sus credenciales de propietario");
        this.setControlador(new ControladorLoginPropietario(this));
    }
  
    @Override
    protected String getSubtitulo() {

        return "Bienvenido usuario Propietario de sistema de peajes";

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
    public void ejecutarLogin(Usuario usuarioPropietario) {
        new DialogoTableroPropietario((java.awt.Frame) this.getParent(), false, (Propietario) usuarioPropietario).setVisible(true);
    }
}
