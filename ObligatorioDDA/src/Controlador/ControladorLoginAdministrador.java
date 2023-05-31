/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Interfaz.VistaLogin;
import Dominio.Usuario;
import Exceptions.UserNotFoundException;
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
    public Usuario loginUsuario(int cedula, String password) {
       return FachadaServicios.getInstancia().loginAdministrador(cedula, password);
    }
    
}
