package Servicios;

import java.util.ArrayList;
import Dominio.Administrador;
import Dominio.Sesion;
import Dominio.Usuario;
import Dominio.Propietario;
import Exceptions.SistemaPeajeException;
import java.util.List;

public class ServicioUsuario {
    
    private List<Propietario> propietarios;
    private List<Administrador> administradores;
    private List<Sesion> usuariosConectados;
    
    public ServicioUsuario() {
        propietarios = new ArrayList();
        administradores = new ArrayList();
        usuariosConectados = new ArrayList();
    }
    
    public void agregar(Propietario propietario) {
        propietarios.add(propietario);
    }

    public void agregar(Administrador administrador) {
        administradores.add(administrador);
    }
    
    public void iniciar(Sesion sesion) {
        usuariosConectados.add(sesion);
    }
    
    public void cerrar(Sesion sesion) {
        usuariosConectados.remove(sesion);
    }
    
    public List<Sesion> getUsuariosConectados() {
        return usuariosConectados;
    }

    public Propietario loginPropietario(int cedula, String password) throws SistemaPeajeException {
        return (Propietario) loginGenerico(cedula, password, (ArrayList) propietarios);
    }
    
    public Administrador loginAdministrador(int cedula, String password) throws SistemaPeajeException {
        return (Administrador) loginGenerico(cedula, password, (ArrayList) administradores);
    }
    
    private Usuario loginGenerico(int cedula, String password, List<Usuario> lista) throws SistemaPeajeException {
        for (Usuario u : lista) {
            if (u.validarCredenciales(cedula, password)) {
                return u;
            }
        }
        throw new SistemaPeajeException("Acceso denegado");
    }
    
}
