package Controlador;

import Dominio.Administrador;
import Interfaz.VistaEmularTransito;
import Observer.Observable;
import Observer.Observador;
import Servicios.FachadaServicios;

public class ControladorEmularTransito implements Observador {

    VistaEmularTransito vista;
    Administrador usuarioAdmin;

    public ControladorEmularTransito(VistaEmularTransito vista, Administrador usuario) {
        this.vista = vista;
        this.usuarioAdmin = usuario;
    }

    public void cerrar() {
        if (vista.confirmar("Confirma que desea salir", "Salir del sistema")) {
            usuarioAdmin.setLogueado(false);
            vista.salir();
        }
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void listarPuestos() {
     
        this.vista.listarPuestos(FachadaServicios.getInstancia().getPuestos());
    }

    
}
