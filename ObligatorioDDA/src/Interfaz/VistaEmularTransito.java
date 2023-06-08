package Interfaz;

import Dominio.Puesto;
import java.util.List;

public interface VistaEmularTransito {

    public void cerrar();

    public boolean confirmar(String mensaje, String title);

    public void salir();

    public void listarPuestos(List<Puesto> puestos);

    public void mostrarTarifas();
}
