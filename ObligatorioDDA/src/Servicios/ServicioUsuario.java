package Servicios;

import java.util.ArrayList;
import Dominio.Administrador;
import Dominio.Sesion;
import Dominio.Usuario;
import Dominio.Propietario;
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

    public Usuario loginUsuario(String usuario, String password) {
        return (Usuario) loginGenerico(usuario, password, (ArrayList) propietarios);
    }
    
    public Administrador loginAdministrador(String usuario, String password) {
        return (Administrador) loginGenerico(usuario, password, (ArrayList) administradores);
    }
    
    private Usuario loginGenerico(String usuario, String password, List<Usuario> lista) {
        for (Usuario u : lista) {
            if (u.validarCredenciales(usuario, password)) {
                return u;
            }
        }
        return null;
    }
    
}
