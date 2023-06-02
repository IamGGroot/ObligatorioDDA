package Servicios;

import java.util.ArrayList;
import Dominio.Administrador;
import Dominio.Usuario;
import Dominio.Propietario;
import Exceptions.SistemaPeajeException;
import java.util.List;

public class ServicioUsuario {
    
    private List<Propietario> propietarios;
    private List<Administrador> administradores;
    
    public ServicioUsuario() {
        propietarios = new ArrayList();
        administradores = new ArrayList();
    }
    
    public void agregar(Propietario propietario) {
        propietarios.add(propietario);
    }

    public void agregar(Administrador administrador) {
        administradores.add(administrador);
    }
    
    public Propietario loginPropietario(int cedula, String password) throws SistemaPeajeException {
        return (Propietario) loginGenerico(cedula, password, (ArrayList) propietarios);
    }
    
    public Administrador loginAdministrador(int cedula, String password) throws SistemaPeajeException {
        Administrador usuario = (Administrador) loginGenerico(cedula, password, (ArrayList) administradores);
        if (usuario.isLogueado()) throw new SistemaPeajeException("Ud. Ya está logueado");
        usuario.setLogueado(true);
        return usuario;
    }
    
    private Usuario loginGenerico(int cedula, String password, List<Usuario> lista) throws SistemaPeajeException {
        for (Usuario u : lista) {
            if (u.validarCredenciales(cedula, password)) {
                return u;
            }
        }
        throw new SistemaPeajeException("Acceso denegado");
    }

    private Exception SistemaPeajeException(String ud_Ya_está_logueado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
