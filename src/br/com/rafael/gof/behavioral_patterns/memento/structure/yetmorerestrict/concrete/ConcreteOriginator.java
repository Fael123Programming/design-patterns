package br.com.rafael.gof.behavioral_patterns.memento.structure.yetmorerestrict.concrete;

import br.com.rafael.gof.behavioral_patterns.memento.structure.yetmorerestrict.interfaces.Memento;
import br.com.rafael.gof.behavioral_patterns.memento.structure.yetmorerestrict.interfaces.Originator;

public class ConcreteOriginator<T> implements Originator<T> {
    private T state;

    public ConcreteOriginator(T state) {
        this.state = state;
    }

    @Override
    public Memento save() {
        return new ConcreteMemento<>(this, state);
    }

    @Override
    public void setState(T state) {
        this.state = state;
    }

    @Override
    public T getState() {
        return state;
    }
}
