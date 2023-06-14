package Servicios;

import Dominio.Administrador;
import Dominio.Bonificacion;
import Dominio.Propietario;
import Dominio.Puesto;
import Dominio.Transito;
import Dominio.Vehiculo;
import Exceptions.SistemaPeajeException;

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

    public void agregar(Administrador administrador) {
        servicioUsuario.agregar(administrador);
    }

    public void agregar(Propietario propietario) {
        servicioUsuario.agregar(propietario);
    }

    public Propietario loginPropietario(int cedula, String password) throws SistemaPeajeException {
        return servicioUsuario.loginPropietario(cedula, password);
    }

    public Administrador loginAdministrador(int cedula, String password) throws SistemaPeajeException {
        return servicioUsuario.loginAdministrador(cedula, password);
    }

    public List<Propietario> getPropietariosConRecargasPendientes() {
        return servicioUsuario.getPropietariosConRecargasPendientes();
    }

    public List<Puesto> getPuestos() {
        return servicioPeaje.getPuestos();
    }

    public void agregar(Puesto puesto) {
        servicioPeaje.agregar(puesto);
    }

    public List<Bonificacion> getBonificaciones() {
        return servicioPeaje.getBonificaciones();
    }

    public void agregar(Bonificacion bonificacion) throws SistemaPeajeException {
        servicioPeaje.agregar(bonificacion);
    }

    public List<Propietario> getPropietarios() {
        return servicioUsuario.getPropietarios();
    }

    public Transito emularTransito(String matricula, Puesto puesto) throws SistemaPeajeException {
        return servicioPeaje.emularTransito(matricula, puesto);
    }

    public Propietario getPropietarioPorCedula(int cedula) throws SistemaPeajeException {
        return servicioUsuario.getPropietarioPorCedula(cedula);
    }

    public void asignarBonificacion(Bonificacion bonificacion, Puesto puesto, Propietario p) throws SistemaPeajeException {
        servicioPeaje.asignarBonificacion(bonificacion, puesto, p);
    }
}
