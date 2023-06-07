package Dominio;

public class Tarifa {

    private double monto;
    private String nombre;
    private Categoria Categoria;

    public Tarifa(double monto, String nombre, Categoria Categoria) {
        this.monto = monto;
        this.nombre = nombre;
        this.Categoria = Categoria;
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
        return Categoria;
    }

    public void setCategoria(Categoria Categoria) {
        this.Categoria = Categoria;
    }

}
