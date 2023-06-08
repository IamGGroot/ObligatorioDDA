package Interfaz;

import Dominio.Bonificacion;
import Dominio.Propietario;
import java.util.List;

public interface VistaEmularAprobacionRecarga {

    public void mostrarRecargas(List<Propietario> propietariosConRecargasPendientes);

    public void aprobarRecarga();

    public void cerrar();

    public boolean confirmar(String mensaje, String title);

    public void salir();

    public void listarBonificaciones(List<Bonificacion> bonificaciones);
}
