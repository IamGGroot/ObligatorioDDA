package Interfaz;

import Dominio.Bonificacion;
import Dominio.Propietario;
import Dominio.Puesto;
import java.util.List;

public interface VistaAsignarBonificaciones {

    public void mostrarBonificaciones(List<Propietario> propietariosConBonificaciones);

    public void listarBonificaciones(List<Bonificacion> bonificaciones);

    public void listarPuestos(List<Puesto> puestos);

    public void asignarBonificacion();

    public void cerrar();

    public void buscar();

    public boolean confirmar(String mensaje, String title);

    public void salir();
}
