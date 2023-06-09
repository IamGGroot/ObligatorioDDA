package Interfaz;

import Dominio.Propietario;
import java.util.List;

public interface VistaEmularAprobacionRecarga {

    public void mostrarRecargas(List<Propietario> propietariosConRecargasPendientes);

    public boolean confirmar(String mensaje, String title);

    public void salir();
}
