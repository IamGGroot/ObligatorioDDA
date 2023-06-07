
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
    
    //TODO() revisar si el flujo es correcto.
    public boolean recargar(Recarga r){
        if(r.getAprobada()){
            this.saldo += r.getMonto();
            recargas.add(r);
            return true;
        }
        return false;
    }
    
    public List<Recarga> getRecargasPendientes() {
        List <Recarga> ret= new ArrayList<Recarga>();
          for (Recarga r : recargas){
              if(!r.getAprobada()){
                   ret.add(r);
              }
        }
          return ret; 
    }
}
