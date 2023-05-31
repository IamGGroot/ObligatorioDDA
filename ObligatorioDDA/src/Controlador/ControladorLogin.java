/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Interfaz.VistaLogin;
import Dominio.Usuario;
import Exceptions.SistemaPeajeException;


/**
 *
 * @author Santiago
 */
public abstract class ControladorLogin {
    private VistaLogin vista;

    public ControladorLogin(VistaLogin vista) {
        this.vista = vista;
    }

    public abstract Usuario loginUsuario(int cedula, String password) throws SistemaPeajeException;

    public void login(int cedula, String password) {
        try {
            Usuario usuario = loginUsuario(cedula, password);
            this.vista.ejecutarLogin(usuario);
            this.vista.cerrarVentana();
        } catch (SistemaPeajeException exc) {
            this.vista.mostrarError(exc.getMessage());
        }
    }

}
