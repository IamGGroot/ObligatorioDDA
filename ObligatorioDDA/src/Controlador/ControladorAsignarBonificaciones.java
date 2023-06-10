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

            List<Bonificacion> bonificacionesPropietario = p.getBonificaciones();
            for (Bonificacion b : bonificacionesPropietario) {
                if (b.getPuesto().equals(puesto)) {
                    throw new SistemaPeajeException("Ya tiene una bonificación asignada para ese puesto");
                }
            }

            Date fecha = new Date();
            //hay que ver como asignar la bonificacion con fechas individuales de asignacion para cada propietario
            Bonificacion nuevaBonificacion = new Bonificacion(fecha, puesto, p, bonificacion.getTipoBonificacion());
            p.agregarBonificacion(nuevaBonificacion);

        } catch (SistemaPeajeException e) {
            this.vista.mostrarError(e.getMessage());
        }
    }

}
