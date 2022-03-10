package br.com.rafael.gof.behavioral_patterns.memento.structure.interfacebased;

public class ConcreteMemento implements Memento {
    private final int state;

    public ConcreteMemento(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }
}
