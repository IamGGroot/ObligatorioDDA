package Interfaz;

import Dominio.Bonificacion;
import Dominio.Propietario;
import Dominio.Puesto;
import java.util.List;

public interface VistaAsignarBonificaciones {

    public void listarBonificaciones(List<Bonificacion> bonificaciones);

    public void listarPuestos(List<Puesto> puestos);

    public boolean confirmar(String mensaje, String title);

    public void salir();

    public void mostrarError(String mensaje);

    public void mostrarPropietarioYTabla(Propietario p);
}
