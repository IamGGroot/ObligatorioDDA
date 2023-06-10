package Interfaz;

import Dominio.Bonificacion;
import Dominio.Puesto;
import java.util.List;

public interface VistaEmularTransito {

    public void cerrar();

    public boolean confirmar(String mensaje, String title);

    public void salir();

    public void listarPuestos(List<Puesto> puestos);

    public void mostrarTarifas();
    
    public void mostrarMensaje(String mensaje);

    public void mostrarExito(String propietario, String categoria, Bonificacion bonificacion, double montoPagado, double saldo);

    public void mostrarError(String mensaje);
}
