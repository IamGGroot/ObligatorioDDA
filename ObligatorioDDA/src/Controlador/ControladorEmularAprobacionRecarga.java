package Controlador;

import Dominio.Administrador;
import Dominio.Notificacion;
import Dominio.Propietario;
import Dominio.Recarga;
import Interfaz.VistaEmularAprobacionRecarga;
import Observer.Observable;
import Observer.Observador;
import Servicios.FachadaServicios;
import java.util.List;

public class ControladorEmularAprobacionRecarga implements Observador {

    private VistaEmularAprobacionRecarga vista;
    private Administrador usuarioAdmin;

    public ControladorEmularAprobacionRecarga(VistaEmularAprobacionRecarga vista, Administrador usuarioAdmin) {
        this.vista = vista;
        this.usuarioAdmin = usuarioAdmin;
        this.inicilizarSubscripciones();
    }

    public void listarListarRecargasPendientes() {
        this.vista.mostrarRecargas(FachadaServicios.getInstancia().getPropietariosConRecargasPendientes());
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        if (((Observable.Evento) evento).equals(Observable.Evento.RECARGA_APROBADA) || ((Observable.Evento) evento).equals(Observable.Evento.RECARGA_AGREGADA)) {
            listarListarRecargasPendientes();
        }

    }

    public void cerrar() {
        if (vista.confirmar("Confirma que desea salir?", "Salir del sistema")) {
            usuarioAdmin.setLogueado(false);
            this.finalizarSubscripciones();
            vista.salir();
        }
    }

    public void aprobarRecarga(Recarga recarga, Propietario propietario) {
        propietario.getCuenta().subscribir(this);
        propietario.getCuenta().recargar(recarga, usuarioAdmin);
        propietario.agregarNotificacion(new Notificacion("Tu recarga de $" + recarga.getMonto() + " fue aprobada"));
    }

    private void inicilizarSubscripciones() {
        List<Propietario> propietarios = FachadaServicios.getInstancia().getPropietarios();
        for (Propietario p : propietarios) {
            p.getCuenta().subscribir(this);
        }
    }

    private void finalizarSubscripciones() {
        List<Propietario> propietarios = FachadaServicios.getInstancia().getPropietarios();
        for (Propietario p : propietarios) {
            p.getCuenta().desubscribir(this);
        }
    }

}
