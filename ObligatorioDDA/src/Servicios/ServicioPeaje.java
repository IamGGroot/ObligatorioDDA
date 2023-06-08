package Servicios;

import Dominio.Bonificacion;
import Dominio.Propietario;
import Dominio.Puesto;
import Dominio.Recarga;
import java.util.ArrayList;
import Dominio.Vehiculo;
import java.util.List;

public class ServicioPeaje {

    private List<Vehiculo> vehiculos;
    private List<Recarga> recargas;
    private List<Puesto> puestos;
    private List<Bonificacion> bonificaciones;

    public ServicioPeaje() {
        vehiculos = new ArrayList();
        recargas = new ArrayList();
        puestos = new ArrayList();
        bonificaciones = new ArrayList();
    }

    public void agregar(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void agregar(Puesto puesto) {
        puestos.add(puesto);
    }

    public void agregar(Recarga recarga) {
        recargas.add(recarga);
    }

    public List<Recarga> getRecargas() {
        return recargas;
    }

    public List<Puesto> getPuestos() {

        return puestos;
    }

    List<Bonificacion> getBonificaciones() {
        return bonificaciones;
    }

}
