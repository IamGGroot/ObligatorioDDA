/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import Dominio.Usuario;

/**
 *
 * @author imm
 */
public interface VistaLogin {
    
    public void mostrarError(String msg);
    public void cerrarVentana();
    public void ejecutarLogin(Usuario usu);
}
