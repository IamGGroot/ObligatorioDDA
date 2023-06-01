
package Servicios;

import Dominio.Administrador;
import Dominio.Propietario;
import Dominio.Sesion;
import Dominio.Vehiculo;
import Exceptions.SistemaPeajeException;
import java.util.ArrayList;
import java.util.List;

public class FachadaServicios {

    private static FachadaServicios instancia;

    private ServicioPeaje servicioPeaje;
    private ServicioUsuario servicioUsuario;

    private FachadaServicios() {
        servicioPeaje = new ServicioPeaje();
        servicioUsuario = new ServicioUsuario();
    }

    public synchronized static FachadaServicios getInstancia() {
        if (instancia == null) {
            synchronized (FachadaServicios.class) {
                if (instancia == null) {
                    instancia = new FachadaServicios();
                }
            }
        }
        return instancia;
    }

    public void agregar(Vehiculo vehiculo) {
        servicioPeaje.agregar(vehiculo);
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return servicioPeaje.getVehiculos();
    }

    public void agregar(Administrador administrador) {
        servicioUsuario.agregar(administrador);
    }

    public void agregar(Propietario propietario) {
        servicioUsuario.agregar(propietario);
    }

    public void iniciar(Sesion sesion) {
        servicioUsuario.iniciar(sesion);
    }

    public void cerrar(Sesion sesion) {
        servicioUsuario.cerrar(sesion);
    }

    public List<Sesion> getUsuariosConectados() {
        return servicioUsuario.getUsuariosConectados();
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        servicioPeaje.setVehiculos(vehiculos);
    }

    public Propietario loginPropietario(int cedula, String password) throws SistemaPeajeException {
        return servicioUsuario.loginPropietario(cedula, password);
    }

    public Administrador loginAdministrador(int cedula, String password) throws SistemaPeajeException {
        return servicioUsuario.loginAdministrador(cedula, password);
    }
}
