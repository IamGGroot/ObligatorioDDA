/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import Dominio.Propietario;
import Dominio.Usuario;
import Exceptions.SistemaPeajeException;
import Servicios.FachadaServicios;
import java.awt.Frame;

/**
 *
 * @author anapl
 */
public class DialogoLoginPropietario extends DialogoLoginGenerico {

    public DialogoLoginPropietario(Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("Ingrese sus credenciales de propietario");

    }

    @Override
    protected String getSubtitulo() {
        return "Bienvenido usuario Propietario de sistema de peajes";
    }

    @Override
    protected Usuario loginUsuarioGenerico(int cedula, String password) throws SistemaPeajeException {
        return FachadaServicios.getInstancia().loginPropietario(cedula, password);
    }

    @Override
    protected void ejecutarCasoLogin(Usuario usuario) {
        new DialogoTableroPropietario((java.awt.Frame) this.getParent(), false, (Propietario) usuario).setVisible(true);
    }
    
}
