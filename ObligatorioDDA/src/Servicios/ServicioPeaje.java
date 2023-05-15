package Servicios;

import java.util.ArrayList;
import Dominio.Vehiculo;

public class ServicioPeaje {

    private ArrayList<Vehiculo> vehiculos;

    public ServicioPeaje() {
        vehiculos = new ArrayList();

    }

    public void agregar(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

}
