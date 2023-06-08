package Dominio;

public class Tarifa {

    private double monto;
    private String nombre;
    private Categoria categoria;

    public Tarifa(double monto, String nombre, Categoria Categoria) {
        this.monto = monto;
        this.nombre = nombre;
        this.categoria = Categoria;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria Categoria) {
        this.categoria = Categoria;
    }

}
