package Controlador;

import Dominio.Propietario;
import Dominio.Recarga;
import Dominio.Transito;
import Dominio.Vehiculo;
import Interfaz.RecargarSaldo;
import Interfaz.VistaTableroPropietario;
import Observer.Observable;
import Observer.Observador;
import java.util.ArrayList;
import java.util.List;

public class ControladorTableroPropietario implements Observador {

    private VistaTableroPropietario vista;
    private Propietario propietario;

    public ControladorTableroPropietario(VistaTableroPropietario vista, Propietario propietario) {
        this.vista = vista;
        this.propietario = propietario;
        this.propietario.subscribir(this);
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        if (((Observable.Evento) evento).equals(Observable.Evento.NOTIFICACIONES_BORRADAS)) {
            vista.mostrarNotificaciones(this.propietario.getNotificaciones());
        }
        //aca voy a poder actualizar las listas y mostrar básicamente. 
    }

    public void cerrar() {
        if (vista.confirmar("Confirma que desea salir", "Salir del sistema")) {
            this.propietario.desubscribir(this);
            vista.salir();
        }

    }

    public void obtenerNombre() {
        vista.mostrarNombrePropietario(this.propietario.getNombre());
    }

    public void obtenerSaldo() {
        vista.mostrarSaldo(this.propietario.getCuenta().getSaldo());
    }

    public void obtenerVehiculos() {
        vista.mostrarVehiculos(this.propietario.getMisVehiculos());
    }

    public void obtenerBonificaciones() {
        vista.mostrarBonificaciones(this.propietario.getBonificaciones());
    }

    public void obtenerTransitos() {
        vista.mostrarTransitos(this.propietario.getTransitos());
    }

    public void obtenerRecargas() {
        vista.mostrarRecargas(this.propietario.getCuenta().getRecargas());
    }

    public void recargar() {
        new RecargarSaldo().setVisible(true);
    }

    public void borrarNotificaciones() {
        this.propietario.borrarNotificaciones();
    }

    public void obtenerNotificaciones() {
        vista.mostrarNotificaciones(this.propietario.getNotificaciones());
    }

}
