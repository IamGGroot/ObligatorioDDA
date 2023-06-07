package Servicios;

import Dominio.Propietario;
import Dominio.Recarga;
import java.util.ArrayList;
import Dominio.Vehiculo;
import java.util.List;

public class ServicioPeaje {

    private List<Vehiculo> vehiculos;
    private List<Recarga> recargas;
    private List<Propietario> propietarios;

    public ServicioPeaje() {
        vehiculos = new ArrayList();
        recargas = new ArrayList();
    }

    public void agregar(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void agregar(Recarga recarga) {
        recargas.add(recarga);
    }

    public List<Recarga> getRecargas() {
        return recargas;
    }

    public List<Propietario> getPropietariosConRecargasPendientes() {
        List<Propietario> ret = new ArrayList<Propietario>();
        for (Propietario p : propietarios) {
            if (p.tieneRecargasPendientes()) {
                ret.add(p);
            }
        }
        return ret;
    }
}
