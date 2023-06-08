package Controlador;

import Dominio.Administrador;
import Dominio.Notificacion;
import Dominio.Puesto;
import Dominio.Vehiculo;
import Interfaz.VistaEmularTransito;
import Observer.Observable;
import Observer.Observador;
import Servicios.FachadaServicios;
import java.util.Date;
import java.util.List;

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

    public Vehiculo obtenerVehiculoPorMatricula(String matricula) {
        List<Vehiculo> vehiculos = FachadaServicios.getInstancia().getVehiculos();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                return vehiculo;
            }
        }
        return null;
    }

    public Puesto obtenerPuestoPorNombre(String nombrePuesto) {
        List<Puesto> puestos = FachadaServicios.getInstancia().getPuestos();
        for (Puesto puesto : puestos) {
            if (puesto.getNombre().equals(nombrePuesto)) {
                return puesto;
            }
        }
        return null;
    }

    public boolean registrarTransito(Vehiculo vehiculo, Puesto puesto, Date fechaHoraActual) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}
