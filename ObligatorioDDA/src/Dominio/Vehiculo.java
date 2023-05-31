package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {

    private String matricula;
    private String color;
    private String modelo;
    private List<Transito> transitos;
    private Categoria categoria;

    public Vehiculo(String matricula, String color, String modelo, Categoria categoria) {

        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
        this.transitos = new ArrayList();
        this.categoria = categoria;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public List<Transito> getTransitos() {
        return transitos;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void agregarTransito(Transito nuevoTransito) {
        this.transitos.add(nuevoTransito);
    }

    public double montoTotalTransitos() {
        double montoTotal = 0;
        for(Transito t: transitos){
            montoTotal += t.getMontoPagado();
        }
        return montoTotal;
    }

}
