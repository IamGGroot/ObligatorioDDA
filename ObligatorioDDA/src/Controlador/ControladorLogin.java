/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Interfaz.VistaLogin;
/**
 *
 * @author Santiago
 */
public abstract class ControladorLogin {

    VistaLogin vista;

    public ControladorLogin(VistaLogin vista) {
        this.vista = vista;
    }

    public abstract void loginUsuario(int cedula, String password);
}
