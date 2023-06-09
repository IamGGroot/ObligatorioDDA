package Main;

import Exceptions.SistemaPeajeException;
import Interfaz.VentanaInicio;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here

        try {
            DatosDePrueba.cargar();
            VentanaInicio ventana = new VentanaInicio();
            //inicio ini=new inicio();

            ventana.setVisible(true);
            //IngresarALaAplicacion ventana = new IngresarALaAplicacion();
            //TableroDeControlDelPropietario ventana2 = new TableroDeControlDelPropietario();
            //ventana.setVisible(true);
            //ventana2.setVisible(true);
        } catch (SistemaPeajeException e) {
            System.out.println(e.getMessage());
        }
    }

}
