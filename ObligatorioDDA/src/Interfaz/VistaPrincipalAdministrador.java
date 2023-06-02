package Interfaz;

import Dominio.Administrador;

public interface VistaPrincipalAdministrador {

    public void cerrar();

    public boolean confirmar(String mensaje, String title);

    public void salir();

    public void emularTransito(Administrador usuarioAdmin);

    public void emularAprobacionRecarga(Administrador usuarioAdmin);

    public void asignarBonificacion(Administrador usuarioAdmin);

}
