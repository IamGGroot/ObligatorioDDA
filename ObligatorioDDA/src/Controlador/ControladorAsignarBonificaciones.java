package Controlador;

import Dominio.Administrador;
import Dominio.Bonificacion;
import Dominio.Propietario;
import Dominio.Puesto;
import Dominio.Vehiculo;
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
        List<Propietario> propietarios = FachadaServicios.getInstancia().getPropietarios();
        for (Propietario p : propietarios) {
            if (p.getCedula() == (cedula)) {
                return p;
            }
        }
        return null;
    }

    public void asignarBonificacion(Propietario propietario, String bonificacion, String puesto) {

        List<Bonificacion> bonificaciones = FachadaServicios.getInstancia().getBonificaciones();
        Bonificacion selectedBonificacion = new Bonificacion();

        for (Bonificacion b : bonificaciones) {
            if (b.getNombre() == bonificacion) {
                selectedBonificacion = b;
                break;
            }
        }
        List<Puesto> puestos = FachadaServicios.getInstancia().getPuestos();
        Puesto selectedPuesto = null;

        for (Puesto p : puestos) {
            if (p.getNombre() == puesto) {
                selectedPuesto = p;
                break;
            }
        }

        Date fecha = new Date();

        
        Bonificacion nuevaBonificacion = new Bonificacion(selectedBonificacion.getNombre(), fecha, selectedPuesto, propietario, selectedBonificacion.getTipoBonificacion());
       
        FachadaServicios.getInstancia().agregar(nuevaBonificacion);
        selectedPuesto.agregarBonificacion(nuevaBonificacion);
        propietario.agregarBonificacion(nuevaBonificacion);

    }

}
