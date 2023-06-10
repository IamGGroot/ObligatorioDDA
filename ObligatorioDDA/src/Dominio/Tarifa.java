package Dominio;

public class Tarifa {

    private double monto;
    private Categoria categoria;

    public Tarifa(double monto, Categoria Categoria) {
        this.monto = monto;
        this.categoria = Categoria;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria Categoria) {
        this.categoria = Categoria;
    }

}
