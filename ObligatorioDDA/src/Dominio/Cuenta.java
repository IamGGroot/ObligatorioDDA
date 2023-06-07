
package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private double saldo;
    private List<Recarga> recargas;
    private List<Recarga> recargasPendientes;

    public Cuenta() {
        this.saldo = 0;
        this.recargas = new ArrayList();
        this.recargasPendientes = new ArrayList();
    }

    public List<Recarga> getRecargas() {
        return recargas;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean recargar(Recarga r){
        if(r.getAprobada()){
            this.saldo += r.getMonto();
            recargas.add(r);
            return true;
        }
        recargasPendientes.add(r);
        return false;
    }
    
    public List<Recarga> getRecargasPendientes() {
       return recargasPendientes;
    }
}
