package Main;

import InterfazPropietarios.IngresarALaAplicacion;
import InterfazPropietarios.TableroDeControlDelPropietario;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        DatosDePrueba.cargar();

        IngresarALaAplicacion ventana = new IngresarALaAplicacion();

        TableroDeControlDelPropietario ventana2 = new TableroDeControlDelPropietario();

        ventana.setVisible(true);
        ventana2.setVisible(true);
    }

}
