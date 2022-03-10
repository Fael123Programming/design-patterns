package br.com.rafael.gof.behavioral_patterns.memento.structure.yetmorerestrict.concrete;

import br.com.rafael.gof.behavioral_patterns.memento.structure.yetmorerestrict.interfaces.Memento;
import br.com.rafael.gof.behavioral_patterns.memento.structure.yetmorerestrict.interfaces.Originator;

public class ConcreteMemento<T> implements Memento {
    private final Originator<T> originator;
    private final T state;

    public ConcreteMemento(Originator<T> originator, T state) {
        this.originator = originator;
        this.state = state;
    }

    @Override
    public void restore() {
        this.originator.setState(state);
    }
}
