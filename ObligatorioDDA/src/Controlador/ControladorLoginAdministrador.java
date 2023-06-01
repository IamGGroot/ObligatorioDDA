/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Interfaz.VistaLogin;
import Dominio.Usuario;
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
    public void loginUsuario(String cedula, String password) {
        try {
            int cedulaUsuario = Integer.parseInt(cedula);
            Usuario usuario = FachadaServicios.getInstancia().loginAdministrador(cedulaUsuario, password);
            this.vista.ejecutarLogin(usuario);
        } catch (SistemaPeajeException | NumberFormatException ex) {
            this.vista.mostrarError(ex.getMessage());
        }
    }
}
