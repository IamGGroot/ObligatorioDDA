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

    @Override
    public int calcularDescuento(Transito transito) {
        Vehiculo v = transito.getVehiculo();
        LocalDate fechaTActual = transito.getFechaYHora().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        List<Transito> transitos = v.obtenerTransitosPuestoFecha(transito.getPuesto(), fechaTActual);
        if (!transitos.isEmpty()) {
            return getDescuento();
        }

        return 0;
    }

}
