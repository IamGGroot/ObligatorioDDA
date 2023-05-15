package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {

    private String matricula;
    private String color;
    private String modelo;
    private List<Transito> transitos;

    public Vehiculo(String matricula, String color, String modelo) {

        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
        this.transitos = new ArrayList();
    }

    public List<Transito> getTransitos() {
        return transitos;
    }

    public void setTransitos(List<Transito> transitos) {
        this.transitos = transitos;
    }

    public double montoTotalTransitos() {
        //TODO() Calcular
        return 0;
    }

}
