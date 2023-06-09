package Controlador;

import Dominio.Propietario;
import Dominio.Recarga;
import Exceptions.SistemaPeajeException;
import Interfaz.VistaRecargarSaldo;
import java.util.Date;

/**
 *
 * @author Santiago Lacretta
 */
public class ControladorRecargarSaldo {

    private VistaRecargarSaldo vista;
    private Propietario propietario;

    public ControladorRecargarSaldo(VistaRecargarSaldo vista, Propietario propietario) {
        this.vista = vista;
        this.propietario = propietario;
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
            vista.mostrarExito("Recarga ingresada correctamente");
        } catch (SistemaPeajeException e) {
            vista.mostrarError(e.getMessage());
        }
    }

}
