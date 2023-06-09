package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    // Listar los eventos que el observable concreto puede emitir
    public enum Evento {
        NOTIFICACIONES_BORRADAS,
        RECARGA_AGREGADA;
    }

    private List<Observador> observadores;

    public Observable() {
        observadores = new ArrayList();
    }

    public void subscribir(Observador o) {
        this.observadores.add(o);
    }

    public void desubscribir(Observador o) {
        this.observadores.remove(o);
    }

    public void notificar(Observable.Evento e) {
        for (Observador o : observadores) {
            o.notificar(this, e);
        }
    }
}
