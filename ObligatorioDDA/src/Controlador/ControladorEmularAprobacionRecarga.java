/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dominio.Administrador;
import Interfaz.VistaEmularAprobacionRecarga;
import Servicios.FachadaServicios;
/**
 *
 * @author Santiago Lacretta
 */
public class ControladorEmularAprobacionRecarga {
    private VistaEmularAprobacionRecarga vista;
    private Administrador usuarioAdmin;

    public ControladorEmularAprobacionRecarga(VistaEmularAprobacionRecarga vista, Administrador usuarioAdmin) {
        this.vista = vista;
        this.usuarioAdmin = usuarioAdmin;
    }
     public void listarListarRecargasPendientes() {
        this.vista.mostrarRecargas(FachadaServicios.getInstancia().getPropietariosConRecargasPendientes());
    }

    
    
}
