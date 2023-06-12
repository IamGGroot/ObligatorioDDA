package Controlador;

import Dominio.Propietario;
import Dominio.Recarga;
import Exceptions.SistemaPeajeException;
import Interfaz.VistaRecargarSaldo;
import Observer.Observable;
import Observer.Observador;
import java.util.Date;

/**
 *
 * @author Santiago Lacretta
 */
public class ControladorRecargarSaldo implements Observador {

    private VistaRecargarSaldo vista;
    private Propietario propietario;

    public ControladorRecargarSaldo(VistaRecargarSaldo vista, Propietario propietario) {
        this.vista = vista;
        this.propietario = propietario;
        this.propietario.getCuenta().subscribir(this);
    }

    public void obtenerNombre() {
        vista.mostrarNombre(this.propietario.getNombre());
    }

    public void obtenerSaldo() {
        vista.mostrarSaldo(this.propietario.getCuenta().getSaldo());
    }

    public void enviarRecarga(double monto) {
        Recarga recarga = new Recarga(new Date(), monto);
        try {
            this.propietario.getCuenta().agregar(recarga);
        } catch (SistemaPeajeException e) {
            vista.mostrarError(e.getMessage());
        }
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        if (((Observable.Evento) evento).equals(Observable.Evento.RECARGA_AGREGADA)) {
            vista.mostrarExito("Recarga ingresada correctamente");
        }
        if (((Observable.Evento) evento).equals(Observable.Evento.RECARGA_APROBADA)) {
            obtenerSaldo();
        }
    }
}
