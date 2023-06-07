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
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        //aca voy a poder actualizar las listas y mostrar básicamente. 
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void cerrar() {
        //desuscribir del observable.
        if (vista.confirmar("Confirma que desea salir", "Salir del sistema")) {
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
        List<Transito> transitos = new ArrayList();
        List<Vehiculo> vehiculos = this.propietario.getMisVehiculos();
        for (Vehiculo v : vehiculos) {
            transitos.addAll(v.getTransitos());
        }
        vista.mostrarTransitos(transitos);
    }

    public void obtenerRecargas() {
        List<Recarga> recargas = this.propietario.getCuenta().getRecargas();
        vista.mostrarRecargas(recargas);
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