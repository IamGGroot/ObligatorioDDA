package Main;


import Interfaz.VentanaInicio;



public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        DatosDePrueba.cargar();
        VentanaInicio ventana = new VentanaInicio();
        //inicio ini=new inicio();
        
        ventana.setVisible(true);
        //IngresarALaAplicacion ventana = new IngresarALaAplicacion();
        //TableroDeControlDelPropietario ventana2 = new TableroDeControlDelPropietario();
        //ventana.setVisible(true);
        //ventana2.setVisible(true);

    }

}
