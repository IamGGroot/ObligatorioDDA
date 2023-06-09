package Controlador;

import Dominio.Administrador;
import Dominio.Propietario;
import Dominio.Puesto;
import Dominio.Transito;
import Dominio.Vehiculo;
import Exceptions.SistemaPeajeException;
import Interfaz.VistaEmularTransito;
import Servicios.FachadaServicios;

public class ControladorEmularTransito {

    VistaEmularTransito vista;
    Administrador usuarioAdmin;

    public ControladorEmularTransito(VistaEmularTransito vista, Administrador usuario) {
        this.vista = vista;
        this.usuarioAdmin = usuario;
    }

    public void cerrar() {
        if (vista.confirmar("Confirma que desea salir", "Emular transito")) {
            usuarioAdmin.setLogueado(false);
            vista.salir();
        }
    }

    public void listarPuestos() {
        this.vista.listarPuestos(FachadaServicios.getInstancia().getPuestos());
    }

    public void emularTransito(String matricula, Puesto puesto) {
        try {
            Transito t = FachadaServicios.getInstancia().emularTransito(matricula, puesto);
            Vehiculo v = t.getVehiculo();
            Propietario p = v.getPropietario();
            this.vista.mostrarExito(p.getNombre(),  v.getCategoria().getNombre(), t.getBonificacion(), t.getMontoPagado(),p.getCuenta().getSaldo()) ;
        } catch(SistemaPeajeException e){
            this.vista.mostrarError(e.getMessage());
        }
    }
    
}
