package Dominio;

public class Exonerados extends TipoBonificacion {

    public Exonerados(String nombre) {
        super(nombre);
    }

    public Exonerados() {
        super("Exonerados");
    }

    @Override
    public int calcularDescuento(Object transito) {
        return 100;
    }

}
