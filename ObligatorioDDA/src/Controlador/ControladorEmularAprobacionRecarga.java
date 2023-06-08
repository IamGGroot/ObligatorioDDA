package Controlador;

import Dominio.Administrador;
import Interfaz.VistaEmularAprobacionRecarga;
import Observer.Observable;
import Observer.Observador;
import Servicios.FachadaServicios;

public class ControladorEmularAprobacionRecarga implements Observador{

    private VistaEmularAprobacionRecarga vista;
    private Administrador usuarioAdmin;

    public ControladorEmularAprobacionRecarga(VistaEmularAprobacionRecarga vista, Administrador usuarioAdmin) {
        this.vista = vista;
        this.usuarioAdmin = usuarioAdmin;
    }

    public void listarListarRecargasPendientes() {
        this.vista.mostrarRecargas(FachadaServicios.getInstancia().getPropietariosConRecargasPendientes());
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void cerrar(){
    if(vista.confirmar("Confirma que desea salir?", "Salir del sistema")){
     //Desuscribir
        vista.salir();
    }
    }
     


}
