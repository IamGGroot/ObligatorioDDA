package Interfaz;

public interface VistaRecargarSaldo {

    public void mostrarSaldo(double saldo);

    public void mostrarNombre(String nombre);

    public void mostrarError(String msg);

    public void mostrarExito(String msg);

    public boolean confirmar(String mensaje, String title);

    public void salir();

}
