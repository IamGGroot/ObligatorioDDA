package Dominio;

public abstract class TipoBonificacion {
    private String nombre;
    
    public TipoBonificacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public abstract int calcularDescuento(Transito transito);
    
}
