package Dominio;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

public class Frecuentes extends TipoBonificacion {

    private static int descuento = 50;

    public static int getDescuento() {
        return descuento;
    }

    public Frecuentes(String nombre) {
        super(nombre);
    }

    public Frecuentes() {
        super("Frecuentes");
    }

    @Override
    public int calcularDescuento(Transito transito) {
        Propietario p = transito.getVehiculo().getPropietario();
        LocalDate fechaTActual = transito.getFechaYHora().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        List<Transito> transitos = p.obtenerTransitosVehiculoPuestoFecha(transito.getVehiculo(), transito.getPuesto(), fechaTActual);

        if (transitos.isEmpty() || transitos.get(0).getFechaYHora().equals(transito.getFechaYHora())) {
            return 0;
        }
        if (transitos.size() >= 1) {
            return getDescuento();
        }

        return 0;
    }

}
