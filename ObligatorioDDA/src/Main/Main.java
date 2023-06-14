package Main;

import Exceptions.SistemaPeajeException;
import Interfaz.VentanaInicio;

public class Main {

    public static void main(String[] args) {
        try {
            DatosDePrueba.cargar();
            VentanaInicio ventana = new VentanaInicio();
            ventana.setVisible(true);
        } catch (SistemaPeajeException e) {
            System.out.println(e.getMessage());
        }
    }

}
