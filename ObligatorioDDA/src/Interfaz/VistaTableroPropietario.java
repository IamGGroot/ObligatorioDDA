package Interfaz;

import Dominio.Bonificacion;
import Dominio.Notificacion;
import Dominio.Recarga;
import Dominio.Transito;
import Dominio.Vehiculo;
import java.util.List;

public interface VistaTableroPropietario {

    public void mostrarNombrePropietario(String nombre);

    public void mostrarSaldo(double saldo);

    public void mostrarVehiculos(List<Vehiculo> vehiculos);

    public void mostrarBonificaciones(List<Bonificacion> bonificaciones);

    public void mostrarTransitos(List<Transito> transitos);

    public void mostrarRecargas(List<Recarga> recargas);

    public void mostrarNotificaciones(List<Notificacion> notificaciones);

    public boolean confirmar(String mensaje, String title);

    public void salir();
}
