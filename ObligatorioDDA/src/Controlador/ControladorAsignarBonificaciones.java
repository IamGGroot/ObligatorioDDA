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

    public Propietario obtenerPropietarioPorCedula(int cedula) {
        try {

            List<Propietario> propietarios = FachadaServicios.getInstancia().getPropietarios();
            for (Propietario p : propietarios) {
                if (p.getCedula() == (cedula)) {
                    return this.vista.mostrarPropietario(p);
                }
            }

        } catch (SistemaPeajeException e) {
            this.vista.mostrarError(e.getMessage());
        }

    }

    public void asignarBonificacion(Propietario propietario, Bonificacion bonificacion, Puesto puesto) {

        List<Bonificacion> bonificaciones = FachadaServicios.getInstancia().getBonificaciones();
        Bonificacion selectedBonificacion = null;

        for (Bonificacion b : bonificaciones) {
            if (b == bonificacion) {
                selectedBonificacion = b;
                break;
            }
        }
        List<Puesto> puestos = FachadaServicios.getInstancia().getPuestos();
        Puesto selectedPuesto = null;

        for (Puesto p : puestos) {
            if (p == puesto) {
                selectedPuesto = p;
                break;
            }
        }

        Date fecha = new Date();

        Bonificacion nuevaBonificacion = new Bonificacion(fecha, selectedPuesto, propietario, selectedBonificacion.getTipoBonificacion());

        FachadaServicios.getInstancia().agregar(nuevaBonificacion);
        selectedPuesto.agregarBonificacion(nuevaBonificacion);
        propietario.agregarBonificacion(nuevaBonificacion);

    }

}
