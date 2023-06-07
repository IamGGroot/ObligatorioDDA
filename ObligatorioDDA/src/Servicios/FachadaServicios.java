
package Servicios;

import Dominio.Administrador;
import Dominio.Propietario;
import Dominio.Recarga;
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

    public List<Vehiculo> getVehiculos() {
        return servicioPeaje.getVehiculos();
    }

    public void agregar(Administrador administrador) {
        servicioUsuario.agregar(administrador);
    }

    public void agregar(Propietario propietario) {
        servicioUsuario.agregar(propietario);
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

    public void agregar(Recarga recarga) {
        servicioPeaje.agregar(recarga);
    }

    public List<Propietario> getPropietariosConRecargasPendientes() {
        return servicioUsuario.getPropietariosConRecargasPendientes();
    }
    

}
