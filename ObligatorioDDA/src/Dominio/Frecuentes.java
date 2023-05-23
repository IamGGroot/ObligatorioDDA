package Dominio;

public class Frecuentes extends TipoBonificacion {

    private static int descuento = 50;

    public static int getDescuento() {
        return descuento;
    }

    public Frecuentes(String nombre) {
        super(nombre);
    }

    public Frecuentes() {
        super("Frecuentes");
    }

    @Override
    public int calcularDescuento(Transito transito) {
        return getDescuento();
    }

}
