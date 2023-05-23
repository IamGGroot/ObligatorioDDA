package Dominio;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Trabajadores extends TipoBonificacion {

    private static int descuento = 80;
    //2 representa lunes y 6 representa viernes. 1 es domingo y 7 es sábado
    private static List<Integer> diasSemana = Arrays.asList(2, 3, 4, 5, 6);

    public static int getDescuento() {
        return descuento;
    }

    public Trabajadores(String nombre) {
        super(nombre);
    }

    public Trabajadores() {
        super("Frecuentes");
    }

    @Override
    public int calcularDescuento(Transito transito) {
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(transito.getFechaYHora());
        int diaSemana = calendario.get(Calendar.DAY_OF_WEEK);
        
        if (diasSemana.contains(diaSemana)) {
            return getDescuento();
        }
        return 0;
    }

}
