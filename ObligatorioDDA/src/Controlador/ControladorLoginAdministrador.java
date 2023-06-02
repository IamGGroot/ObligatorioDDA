/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dominio.Administrador;
import Interfaz.VistaLogin;
import Exceptions.SistemaPeajeException;
import Servicios.FachadaServicios;

/**
 *
 * @author imm
 */
public class ControladorLoginAdministrador extends ControladorLogin {

    public ControladorLoginAdministrador(VistaLogin vista) {
        super(vista);
    }

    @Override
    public void loginUsuario(int cedula, String password) {
        try {
            Administrador usuario = FachadaServicios.getInstancia().loginAdministrador(cedula, password);
            this.vista.ejecutarLogin(usuario);
        } catch (SistemaPeajeException ex) {
            this.vista.mostrarError(ex.getMessage());
        }
    }
}
