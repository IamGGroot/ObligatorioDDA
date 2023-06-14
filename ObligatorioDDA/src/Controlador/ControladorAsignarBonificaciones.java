package Controlador;

import Dominio.Administrador;
import Dominio.Bonificacion;
import Dominio.Propietario;
import Dominio.Puesto;
import Exceptions.SistemaPeajeException;
import Interfaz.VistaAsignarBonificaciones;
import Observer.Observable;
import Observer.Observador;
import Servicios.FachadaServicios;
import java.util.Date;
import java.util.List;

public class ControladorAsignarBonificaciones implements Observador {

    VistaAsignarBonificaciones vista;
    Administrador usuarioAdmin;

    public ControladorAsignarBonificaciones(VistaAsignarBonificaciones vista, Administrador usuario) {
        this.vista = vista;
        this.usuarioAdmin = usuario;
    }

    public void cerrar() {
        if (vista.confirmar("Confirma que desea salir", "Asignar Bonificaciones")) {
            usuarioAdmin.setLogueado(false);
            vista.salir();
        }
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        if (((Observable.Evento) evento).equals(Observable.Evento.BONIFICACION_AGREGADA)) {
            buscarPropietarioPorCedula(((Propietario) origen).getCedula());
        }
    }

    public void listarBonificaciones() {
        this.vista.listarBonificaciones(FachadaServicios.getInstancia().getBonificaciones());
    }

    public void listarPuestos() {
        this.vista.listarPuestos(FachadaServicios.getInstancia().getPuestos());
    }

    public void buscarPropietarioPorCedula(int cedula) {
        try {
            Propietario p = FachadaServicios.getInstancia().getPropietarioPorCedula(cedula);
            this.vista.mostrarPropietarioYTabla(p);
        } catch (SistemaPeajeException e) {
            this.vista.mostrarError(e.getMessage());
        }

    }

    public void asignarBonificacion(Bonificacion bonificacion, Puesto puesto, int cedula) {
        try {
            Propietario p = FachadaServicios.getInstancia().getPropietarioPorCedula(cedula);
            p.subscribir(this);
            FachadaServicios.getInstancia().asignarBonificacion(bonificacion, puesto, p);
            p.desubscribir(this);
        } catch (SistemaPeajeException e) {
            this.vista.mostrarError(e.getMessage());
        }
    }

}
