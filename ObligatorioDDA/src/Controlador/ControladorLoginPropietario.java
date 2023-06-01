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
    public void loginUsuario(String cedula, String password) {
        try {
            //TODO consultar donde se agrega la validación de entero porque en la vista el parseo devuelve error al intentar parsear y lo rompe nada más.
            int cedulaUsuario = Integer.parseInt(cedula);
            Usuario usuario = FachadaServicios.getInstancia().loginPropietario(cedulaUsuario, password);
            this.vista.ejecutarLogin(usuario);
        } catch (SistemaPeajeException | NumberFormatException ex) {
            this.vista.mostrarError(ex.getMessage());
        }
    }

}
