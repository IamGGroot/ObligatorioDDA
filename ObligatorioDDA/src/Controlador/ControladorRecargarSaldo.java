
package Controlador;


import Dominio.Propietario;
import Interfaz.VistaEmularAprobacionRecarga;
import Interfaz.VistaRecargarSaldo;

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
    public void obtenerSaldo() {
        vista.mostrarSaldo(this.propietario.getCuenta().getSaldo());
    }
    
    
    
}
