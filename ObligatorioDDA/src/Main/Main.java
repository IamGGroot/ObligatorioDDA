package Main;

import Interfaz.VentanaInicio;


public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        DatosDePrueba.cargar();
        
        VentanaInicio ventana = new VentanaInicio();
        
        ventana.setVisible(true);
    }

}
