package Dominio;

import java.util.List;

public class Puesto {

    private String nombre;
    private String direccion;
    private List<Bonificacion> bonificaciones;
    private List<Tarifa> tarifas;

    public Puesto(String nombre, String direccion, List<Tarifa> tarifas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tarifas = tarifas;
    }
    
    public List<Bonificacion> getBonificacion() {
        return bonificaciones;
    }

    public void setBonificacion(List<Bonificacion> bonificaciones) {
        this.bonificaciones = bonificaciones;
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
    
    public void agregarBonificacion(Bonificacion bonificacion){
        this.bonificaciones.add(bonificacion);
        
    }


}
