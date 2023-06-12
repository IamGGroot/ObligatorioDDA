package Controlador;

import Dominio.Administrador;
import Dominio.Propietario;
import Dominio.Recarga;
import Exceptions.SistemaPeajeException;
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
        this.usuarioAdmin.subscribir(this);
        this.inicilizar();
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
            this.usuarioAdmin.desubscribir(this);
            vista.salir();
        }
    }

    public void aprobarRecarga(Recarga recarga, Propietario propietario) {
        propietario.getCuenta().subscribir(this);
        recarga.aprobar(usuarioAdmin);
        propietario.getCuenta().recargar(recarga.getMonto());
    }

    private void inicilizar() {
        List<Propietario> propietarios = FachadaServicios.getInstancia().getPropietarios();
        
        for (Propietario p: propietarios){
            p.getCuenta().subscribir(this);
        }
    }

}
