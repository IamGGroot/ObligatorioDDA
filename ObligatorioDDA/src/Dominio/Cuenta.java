package Dominio;

import Exceptions.SistemaPeajeException;
import Observer.Observable;
import java.util.ArrayList;
import java.util.List;

public class Cuenta extends Observable {

    private double saldo;
    private List<Recarga> recargas;

    public Cuenta() {
        this.saldo = 0;
        this.recargas = new ArrayList();
    }

    public List<Recarga> getRecargas() {
        return recargas;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean agregar(Recarga r) throws SistemaPeajeException {
        if (r.getMonto() < 1) throw new SistemaPeajeException("Monto invalido");
        recargas.add(r);
        notificar(Evento.RECARGA_AGREGADA);
        return true;
    }

    public void aprobar(Recarga recarga, Administrador admin) {
        recarga.aprobar(admin);
        this.saldo += recarga.getMonto();
        notificar(Evento.RECARGA_APROBADA);
    }

    public List<Recarga> getRecargasPendientes() {
        List<Recarga> recargasPendientes = new ArrayList();
        for (Recarga r : this.recargas) {
            if (!r.getAprobada()) {
                recargasPendientes.add(r);
            }
        }
        return recargasPendientes;
    }

    public void actualizarSaldo(Double montoPagado) {
        Double nuevoSaldo = this.getSaldo() - montoPagado;
        this.saldo = nuevoSaldo;
    }
}
