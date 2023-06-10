package Servicios;

import Dominio.Bonificacion;
import Dominio.Propietario;
import Dominio.Puesto;
import Dominio.Recarga;
import Dominio.Transito;
import java.util.ArrayList;
import Dominio.Vehiculo;
import Exceptions.SistemaPeajeException;
import java.util.Date;
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

    public void agregar(Bonificacion bonificacion) throws SistemaPeajeException {
        Propietario p = bonificacion.getPropietario();
        Bonificacion b = p.existeBonificacionEnPuesto(bonificacion.getPuesto());
        if (b != null) {
            throw new SistemaPeajeException("Ya existe una bonificacion");
        }
        bonificaciones.add(bonificacion);
    }

    public List<Recarga> getRecargas() {
        return recargas;
    }

    public List<Puesto> getPuestos() {

        return puestos;
    }

    public List<Bonificacion> getBonificaciones() {
        return bonificaciones;
    }

    public Vehiculo getVehiculoPorMatricula(String matricula) throws SistemaPeajeException {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                return vehiculo;
            }
        }
        throw new SistemaPeajeException("No existe el vehículo");
    }

    public Transito emularTransito(String matricula, Puesto puesto) throws SistemaPeajeException {
        Vehiculo v = getVehiculoPorMatricula(matricula);
        Propietario propietarioVehiculo = v.getPropietario();
        Bonificacion b = propietarioVehiculo.getBonificacion(puesto);
        Transito t = new Transito(new Date(), b, puesto, v, 0);
        Double montoAPagar = puesto.calcularMontoConBonificacion(v, b, t);

        if (montoAPagar > v.getPropietario().getCuenta().getSaldo()) {
            throw new SistemaPeajeException("Saldo insuficiente " + v.getPropietario().getCuenta().getSaldo());
        }

        t.setMontoPagado(montoAPagar);
        v.agregarTransito(t);
        return t;
    }

}
