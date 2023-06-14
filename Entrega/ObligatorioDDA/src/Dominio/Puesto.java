package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Puesto implements Renderizable {

    private String nombre;
    private String direccion;
    private List<Bonificacion> bonificaciones;
    private List<Tarifa> tarifas;

    public Puesto(String nombre, String direccion, List<Tarifa> tarifas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tarifas = tarifas;
        this.bonificaciones = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Tarifa> getTarifas() {
        return tarifas;
    }

    public Tarifa tarifaParaVehiculo(Vehiculo v) {
        for (Tarifa t : tarifas) {
            if (t.getCategoria().equals(v.getCategoria())) {
                return t;
            }
        }
        return null;
    }

    public void agregarBonificacion(Bonificacion bonificacion) {
        this.bonificaciones.add(bonificacion);
    }

    @Override
    public String getRenderDetail() {
        return this.getNombre();
    }

}
