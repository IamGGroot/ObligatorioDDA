package Controlador;

import Dominio.Administrador;
import Dominio.Bonificacion;
import Dominio.Propietario;
import Dominio.Puesto;
import Interfaz.VistaAsignarBonificaciones;
import Observer.Observable;
import Observer.Observador;
import Servicios.FachadaServicios;

public class ControladorAsignarBonificaciones implements Observador {

    VistaAsignarBonificaciones vista;
    Administrador usuarioAdmin;

    public ControladorAsignarBonificaciones(VistaAsignarBonificaciones vista, Administrador usuario) {
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

    public void listarBonificaciones() {
        this.vista.listarBonificaciones(FachadaServicios.getInstancia().getBonificaciones());
    }

    public void listarPuestos() {
        this.vista.listarPuestos(FachadaServicios.getInstancia().getPuestos());
    }

    public Propietario getPropietarioPorCedula(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void asignarBonificacion(Propietario propietarioSeleccionado, Bonificacion bonificacionSeleccionada, Puesto puestoSeleccionado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void buscarPropietario(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
