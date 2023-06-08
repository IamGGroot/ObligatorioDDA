package Controlador;

import Dominio.Administrador;
import Interfaz.VistaEmularAprobacionRecarga;
import Servicios.FachadaServicios;

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

    public void listarBonificaciones() {

//        this.vista.listarBonificaciones(FachadaServicios.getInstancia().getBonificaciones());
    }

}
