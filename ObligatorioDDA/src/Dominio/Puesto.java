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

    public List<Tarifa> getTarifas() {
        return tarifas;
    }

    public void setTarifas(List<Tarifa> tarifas) {
        this.tarifas = tarifas;
    }
    
    public double tarifaParaVehiculo(Vehiculo v){
        double tarifa = 0;
        for (Tarifa t: tarifas){
            if(t.getCategoria().equals(v.getCategoria())){
              tarifa = t.getMonto();
            }
        }
        return tarifa;
    }


}
