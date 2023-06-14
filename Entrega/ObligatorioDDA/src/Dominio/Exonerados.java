package Dominio;

public class Exonerados extends TipoBonificacion {

    public Exonerados(String nombre) {
        super(nombre);
    }


    @Override
    public int calcularDescuento(Transito transito) {
        return 100;
    }

}
