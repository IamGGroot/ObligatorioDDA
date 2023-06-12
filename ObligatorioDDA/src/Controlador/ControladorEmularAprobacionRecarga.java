package Controlador;

import Dominio.Administrador;
import Dominio.Cuenta;
import Dominio.Propietario;
import Dominio.Recarga;
import Interfaz.VistaEmularAprobacionRecarga;
import Observer.Observable;
import Observer.Observador;
import Servicios.FachadaServicios;

public class ControladorEmularAprobacionRecarga implements Observador{

    private VistaEmularAprobacionRecarga vista;
    private Administrador usuarioAdmin;

    public ControladorEmularAprobacionRecarga(VistaEmularAprobacionRecarga vista, Administrador usuarioAdmin) {
        this.vista = vista;
        this.usuarioAdmin = usuarioAdmin;
        this.usuarioAdmin.subscribir(this);
    }

    public void listarListarRecargasPendientes() {
        this.vista.mostrarRecargas(FachadaServicios.getInstancia().getPropietariosConRecargasPendientes());
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        if (((Observable.Evento) evento).equals(Observable.Evento.RECARGA_APROBADA)) {
            //this.vista.mostrarRecargas(FachadaServicios.getInstancia().getPropietariosConRecargasPendientes())
            listarListarRecargasPendientes();
        }
        
        if (((Observable.Evento) evento).equals(Observable.Evento.RECARGA_AGREGADA)) {
            listarListarRecargasPendientes();
             //this.vista.mostrarRecargas(FachadaServicios.getInstancia().getPropietariosConRecargasPendientes());
        }
        
    }

    public void cerrar(){
    if(vista.confirmar("Confirma que desea salir?", "Salir del sistema")){
     //Desuscribir
            usuarioAdmin.setLogueado(false);
            this.usuarioAdmin.desubscribir(this);
            vista.salir();
        }
    }

    public void aprobarRecarga(Recarga recarga, Propietario propietario) {
        recarga.aprobar(usuarioAdmin);
        propietario.getCuenta().recargar(recarga.getMonto());
        listarListarRecargasPendientes();
    }

}
