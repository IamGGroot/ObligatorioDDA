/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dominio.Usuario;
import Exceptions.SistemaPeajeException;
import Interfaz.VistaLogin;
import Servicios.FachadaServicios;

/**
 *
 * @author imm
 */
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
