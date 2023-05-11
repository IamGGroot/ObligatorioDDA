package Servicios;

import java.util.ArrayList;
import Dominio.Administrador;
import Dominio.Sesion;
import Dominio.Usuario;
import Dominio.Propietario;

public class ServicioUsuario {
    
    private ArrayList<Propietario> propietarios;
    private ArrayList<Administrador> administradores;
    private ArrayList<Sesion> usuariosConectados;
    
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
    
    public ArrayList<Sesion> getUsuariosConectados() {
        return usuariosConectados;
    }

    public Usuario loginUsuario(String usuario, String password) {
        return (Usuario) loginGenerico(usuario, password, (ArrayList) propietarios);
    }
    
    public Administrador loginAdministrador(String usuario, String password) {
        return (Administrador) loginGenerico(usuario, password, (ArrayList) administradores);
    }
    //PREGUNTAR a los compañeros no entendi lo del string usuario, si lo vamos a usar o no
    private Usuario loginGenerico(String usuario, String password, ArrayList<Usuario> listaUsuarios) {
        /*for (Usuario u : listaUsuarios) {
            if (u.getUsuario().equals(usuario) && u.esPassordValida(password)) {
                return u;
            }
        }*/
        return null;
    }
    
}
