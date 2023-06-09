package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean agregar(Recarga r) {
        recargas.add(r);
        return true;
    }
    
    public void recargar(Double monto) {
        this.saldo += monto;
    }
    

    public List<Recarga> getRecargasPendientes() {
        List<Recarga> recargasPendientes = new ArrayList();
        for(Recarga r: this.recargas){
            if (!r.getAprobada()){
               recargasPendientes.add(r); 
            }
        }
        return recargasPendientes;
    }
}
