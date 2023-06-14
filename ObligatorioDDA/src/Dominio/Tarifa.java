package Dominio;

public class Tarifa {

    private double monto;
    private Categoria categoria;

    public Tarifa(double monto, Categoria Categoria) {
        this.monto = monto;
        this.categoria = Categoria;
    }

    public double getMonto() {
        return monto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

}
