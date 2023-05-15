package Dominio;

import java.util.List;

public class Puesto {

    private String nombre;
    private String direccion;
    private Bonificacion bonificacion;
    private List<Tarifa> tarifas;

    public Puesto(String nombre, String direccion, Bonificacion bonificacion, Tarifa tarifa) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.bonificacion = bonificacion;
        this.tarifas = tarifas;
    }
    
    public Bonificacion getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(Bonificacion bonificacion) {
        this.bonificacion = bonificacion;
    }

    public List<Tarifa> getTarifas(Puesto p) {
        //TODO() Filtrar
        return tarifas;
    }

    public void setTarifas(List<Tarifa> tarifas) {
        this.tarifas = tarifas;
    }


}
